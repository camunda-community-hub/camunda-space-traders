package org.camunda.community.spacetraders

import io.camunda.operate.CamundaOperateClient
import org.mockito.Answers
import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootApplication
@ImportAutoConfiguration(classes = [
    io.camunda.connector.runtime.InboundConnectorsAutoConfiguration::class,
    io.camunda.connector.runtime.OutboundConnectorsAutoConfiguration::class,
    io.camunda.connector.runtime.WebhookConnectorAutoConfiguration::class
])
@MockBean(classes = [CamundaOperateClient::class], answer = Answers.RETURNS_MOCKS)
open class TestConnectorRuntimeApplication {


}

fun main(args: Array<String>) {
    runApplication<TestConnectorRuntimeApplication>(*args)
}