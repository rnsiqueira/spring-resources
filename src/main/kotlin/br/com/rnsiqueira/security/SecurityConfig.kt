package br.com.rnsiqueira.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SecurityConfig {

    @Bean
    fun start() = print("Configuration context of application!!!!!")

}