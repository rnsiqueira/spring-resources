package br.com.rnsiqueira.controller

import br.com.rnsiqueira.entity.User
import br.com.rnsiqueira.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/users")
class UserController(private val userRepository: UserRepository) {

    @GetMapping
    fun getUsers(): List<User> = userRepository.findAll()
}