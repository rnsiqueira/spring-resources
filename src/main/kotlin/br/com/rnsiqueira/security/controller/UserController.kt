package br.com.rnsiqueira.controller

import br.com.rnsiqueira.security.entity.User
import br.com.rnsiqueira.repository.UserRepository
import br.com.rnsiqueira.security.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getUsers(): List<User> = userService.getUsers()
}