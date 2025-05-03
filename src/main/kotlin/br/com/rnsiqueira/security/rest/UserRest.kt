package br.com.rnsiqueira.controller

import br.com.rnsiqueira.domain.utils.parseJson
import br.com.rnsiqueira.security.entity.User
import br.com.rnsiqueira.security.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserRest(private val userService: UserService) {
    @GetMapping
    fun getUsers(): List<User> = userService.getUsers()

    @PostMapping("/login")
    fun findUser(
        @RequestBody payload: String,
    ): User {
        val user = payload.parseJson(User::class)
        return userService.takeUser(user.userName, user.password)
    }
}
