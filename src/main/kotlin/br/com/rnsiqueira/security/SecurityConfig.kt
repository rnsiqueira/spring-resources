package br.com.rnsiqueira.security

import br.com.rnsiqueira.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration

@EnableWebSecurity(debug = true)
class SecurityConfig(@Autowired userService: UserService) {

}