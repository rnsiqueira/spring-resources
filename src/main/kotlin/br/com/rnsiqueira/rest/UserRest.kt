package br.com.rnsiqueira.rest

import br.com.rnsiqueira.domain.utils.parseJson
import br.com.rnsiqueira.entity.User
import br.com.rnsiqueira.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserRest(private val userService: UserService) {
    @GetMapping
    fun getUsers(): List<User> = userService.getUsers()

    @PostMapping("/auth")
    fun findUser(
        @RequestBody payload: String,
    ): User {
        val user = payload.parseJson(User::class)
        return userService.takeUser(user.userName, user.password)
    }
}
