package br.com.rnsiqueira.config

import br.com.rnsiqueira.security.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

@Configuration
class SecurityConfig(
    @Autowired private val userService: UserService,
) {
    @Bean
    @Profile("test")
    fun webSecurityCustomizer(): WebSecurityCustomizer {
        return WebSecurityCustomizer { web: WebSecurity ->
            web.ignoring()
                .requestMatchers(AntPathRequestMatcher("/**"))
        }
    }

    @Bean
    @Throws(Exception::class)
    @Profile("!test")
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http.authorizeRequests()
            .anyRequest().authenticated()
            .requestMatchers("/app/user/login", "/app/user/register").permitAll()
            .and()
            .oauth2Login()
        return http.build()
    }
}
