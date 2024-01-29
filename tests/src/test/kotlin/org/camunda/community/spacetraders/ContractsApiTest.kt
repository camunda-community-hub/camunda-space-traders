package org.camunda.community.spacetraders

import io.camunda.zeebe.client.ZeebeClient
import io.camunda.zeebe.process.test.api.ZeebeTestEngine
import io.camunda.zeebe.spring.test.ZeebeSpringTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.Test
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
class ContractsApiTest {

    @Autowired lateinit var client: ZeebeClient

    @Test
    fun `should fulfill contract`() {
        // given
        val uuid = UUID.randomUUID().toString().substring(0, 8)
        val agentSymbol = "CST_$uuid"

        client.newDeployResourceCommand()
                .addResourceFromClasspath("test-fulfill-contract.bpmn")
                .send()
                .join()

        // when
        val processInstanceResult = client.newCreateInstanceCommand()
                .bpmnProcessId("test-fulfill-contract")
                .latestVersion()
                .variables(mapOf("agent_symbol" to agentSymbol))
                .withResult()
                .send()
                .join()

        // then
        assertThat(processInstanceResult.variablesAsMap)
                .contains(entry("result", "contract-not-fulfilled"))
    }

}