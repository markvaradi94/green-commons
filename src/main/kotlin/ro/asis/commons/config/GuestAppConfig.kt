package ro.asis.commons.config

import org.springframework.amqp.core.AnonymousQueue
import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.TopicExchange
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class GuestAppConfig {

    @Bean
    open fun guestExchange(): TopicExchange = TopicExchange("green.clients")

    @Bean
    open fun newGuestQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun editGuestQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun deleteGuestQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun newGuestBinding(): Binding =
        BindingBuilder.bind(newGuestQueue()).to(guestExchange())
            .with("green.guests.new")

    @Bean
    open fun editGuestBinding(): Binding =
        BindingBuilder.bind(editGuestQueue()).to(guestExchange())
            .with("green.guests.edit")

    @Bean
    open fun deleteGuestBinding(): Binding =
        BindingBuilder.bind(deleteGuestQueue()).to(guestExchange())
            .with("green.guests.delete")
}
