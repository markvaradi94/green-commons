package ro.asis.commons.config

import org.springframework.amqp.core.AnonymousQueue
import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.TopicExchange
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class AccountAppConfig {

    @Bean
    open fun accountExchange(): TopicExchange = TopicExchange("green.accounts")

    @Bean
    open fun newAccountQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun editAccountQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun deleteAccountQueue(): AnonymousQueue = AnonymousQueue()

    @Bean
    open fun newAccountBinding(): Binding =
        BindingBuilder.bind(newAccountQueue()).to(accountExchange())
            .with("green.accounts.new")

    @Bean
    open fun editAccountBinding(): Binding =
        BindingBuilder.bind(editAccountQueue()).to(accountExchange())
            .with("green.accounts.edit")

    @Bean
    open fun deleteAccountBinding(): Binding =
        BindingBuilder.bind(deleteAccountQueue()).to(accountExchange())
            .with("green.accounts.delete")

}
