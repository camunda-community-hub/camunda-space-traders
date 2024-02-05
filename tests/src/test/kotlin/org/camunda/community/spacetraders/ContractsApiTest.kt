package org.camunda.community.spacetraders

import io.camunda.zeebe.client.ZeebeClient
import io.camunda.zeebe.spring.test.ZeebeSpringTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.UUID

@SpringBootTest(
        classes = [TestConnectorRuntimeApplication::class],
        properties = [
            "spring.main.allow-bean-definition-overriding=true",
            "camunda.connector.webhook.enabled=false",
            "camunda.connector.polling.enabled=false"
        ],
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ZeebeSpringTest
@ExtendWith(MockitoExtension::class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContractsApiTest {

    @Autowired
    lateinit var client: ZeebeClient

    var currentToken: String? = null

    fun getToken(): String {
        return currentToken ?: registerAgent()
    }

    fun registerAgent(): String {
        // given
        val uuid = UUID.randomUUID().toString().substring(0, 8)
        val agentSymbol = "CST_$uuid"

        deployProcess("register-agent.bpmn")

        // when
        val resultVariables = createProcessInstance(
                bpmnProcessId = "register-agent",
                variables = mapOf("agent_symbol" to agentSymbol)
        )

        // then
        assertThat(resultVariables).containsKey("token")

        val newToken = resultVariables["token"] as String
        currentToken = newToken
        return newToken
    }

    @Test
    fun `should fulfill contract`() {
        // given
        deployProcess("test-fulfill-contract.bpmn")

        // when
        val resultVariables = createProcessInstance(
                bpmnProcessId = "test-fulfill-contract",
                variables = mapOf("token" to getToken())
        )

        // then
        assertThat(resultVariables).contains(entry("result", "contract-not-fulfilled"))
    }

    @Test
    fun `should handle BPMN error`() {
        // given
        deployProcess("handle-bpmn-error.bpmn")

        // when
        val resultVariables = createProcessInstance(
                bpmnProcessId = "handle-bpmn-error",
                variables = mapOf("token" to getToken())
        )

        // then
        assertThat(resultVariables).contains(entry("result", "error-handled"))

        // TODO: The error variables are not passed in ZPT 8.4.0
        //        assertThat(resultVariables).contains(
        //                entry("error_code", "4236"),
        //                entry("error_name", "shipNotInOrbitError")
        //        ).containsKey("error_message")
        //
        //        assertThat(resultVariables["error_message"] as String)
        //                .startsWith("Ship action failed. Ship is not currently in orbit")
    }

    @Test
    fun `should handle invalid token error`() {
        // given
        deployProcess("handle-invalid-token-error.bpmn")

        // when
        val resultVariables = createProcessInstance(
                bpmnProcessId = "handle-invalid-token-error",
                variables = emptyMap()
        )

        // then
        assertThat(resultVariables).contains(entry("result", "error-handled"))
    }

    private fun deployProcess(resource: String) {
        client.newDeployResourceCommand()
                .addResourceFromClasspath(resource)
                .send()
                .join()
    }

    private fun createProcessInstance(bpmnProcessId: String, variables: Map<String, Any>): Map<String, Any> {
        return client.newCreateInstanceCommand()
                .bpmnProcessId(bpmnProcessId)
                .latestVersion()
                .variables(variables)
                .withResult()
                .send()
                .join()
                .variablesAsMap
    }

}