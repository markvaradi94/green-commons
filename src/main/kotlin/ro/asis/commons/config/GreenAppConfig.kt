package ro.asis.commons.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer
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
    open fun jsonMessageConverter(): MessageConverter {
        val mapper = ObjectMapper()
        mapper.registerModule(JavaTimeModule())
        mapper.registerModule(KotlinModule())
        mapper.configure(WRITE_DATES_AS_TIMESTAMPS, false)
        return Jackson2JsonMessageConverter(mapper)
    }

    @Bean
    open fun configureJackson2() =
        Jackson2ObjectMapperBuilderCustomizer { it.findModulesViaServiceLoader(true) }
}
