package ro.asis.commons.config

import org.springframework.amqp.core.AnonymousQueue
import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.TopicExchange
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ClientAppConfig {

    @Bean
    open fun clientExchange(): TopicExchange = TopicExchange("green.clients")

    @Bean
    open fun newClientQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun editClientQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun deleteClientQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun newClientBinding(): Binding =
        BindingBuilder.bind(newClientQueue()).to(clientExchange())
            .with("green.clients.new")

    @Bean
    open fun editClientBinding(): Binding =
        BindingBuilder.bind(editClientQueue()).to(clientExchange())
            .with("green.clients.edit")

    @Bean
    open fun deleteClientBinding(): Binding =
        BindingBuilder.bind(deleteClientQueue()).to(clientExchange())
            .with("green.clients.delete")
}
