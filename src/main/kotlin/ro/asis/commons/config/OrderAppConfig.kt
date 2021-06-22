package ro.asis.commons.config

import org.springframework.amqp.core.AnonymousQueue
import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.TopicExchange
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class OrderAppConfig {
    @Bean
    open fun orderExchange(): TopicExchange = TopicExchange("green.orders")

    @Bean
    open fun newOrderQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun editOrderQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun deleteOrderQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun newOrderBinding(): Binding =
        BindingBuilder.bind(newOrderQueue()).to(orderExchange())
            .with("green.orders.new")

    @Bean
    open fun editOrderBinding(): Binding =
        BindingBuilder.bind(editOrderQueue()).to(orderExchange())
            .with("green.orders.edit")

    @Bean
    open fun deleteOrderBinding(): Binding =
        BindingBuilder.bind(deleteOrderQueue()).to(orderExchange())
            .with("green.orders.delete")
}
