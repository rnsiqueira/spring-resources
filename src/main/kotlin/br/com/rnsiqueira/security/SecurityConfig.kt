package br.com.rnsiqueira.security

import br.com.rnsiqueira.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SecurityConfig(@Autowired private val userService: UserService) {

    @Bean
    fun userDetailsService() {
        print("Start config security!!!!!")
        userService.getUsers().forEach(System.out::println)
    }

}