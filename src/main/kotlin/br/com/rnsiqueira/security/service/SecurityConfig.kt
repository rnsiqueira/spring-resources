package br.com.rnsiqueira.security.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class SecurityConfig(
    @Autowired private val userService: UserService
) {

    @Bean
    fun filterChain() {
        println("Secuity config!!!")
    }
}