package ro.asis.commons.config

import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
open class GreenAppConfig(
    private val connectionFactory: ConnectionFactory
) {

    @Bean
    open fun restTemplate(): RestTemplate = RestTemplate()

    @Bean
    open fun rabbitTemplate(): RabbitTemplate {
        val template = RabbitTemplate(connectionFactory)
        template.messageConverter = Jackson2JsonMessageConverter()
        return template
    }

    @Bean
    open fun jsonMessageConverter(): MessageConverter = Jackson2JsonMessageConverter()
}
