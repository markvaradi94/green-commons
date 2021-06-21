package ro.asis.commons.config

import org.springframework.amqp.core.AnonymousQueue
import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.TopicExchange
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ProviderAppConfig {

    @Bean
    open fun providerExchange(): TopicExchange = TopicExchange("green.providers")

    @Bean
    open fun newProviderQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun editProviderQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun deleteProviderQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun newProviderBinding(): Binding =
        BindingBuilder.bind(newProviderQueue()).to(providerExchange())
            .with("green.providers.new")

    @Bean
    open fun editProviderBinding(): Binding =
        BindingBuilder.bind(editProviderQueue()).to(providerExchange())
            .with("green.providers.edit")

    @Bean
    open fun deleteProviderBinding(): Binding =
        BindingBuilder.bind(deleteProviderQueue()).to(providerExchange())
            .with("green.providers.delete")
}
