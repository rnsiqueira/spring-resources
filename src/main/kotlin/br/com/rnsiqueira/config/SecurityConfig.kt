package br.com.rnsiqueira.config

import br.com.rnsiqueira.security.service.UserService
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