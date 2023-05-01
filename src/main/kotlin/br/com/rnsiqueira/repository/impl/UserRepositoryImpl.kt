package br.com.rnsiqueira.repository.impl

import br.com.rnsiqueira.entity.User
import br.com.rnsiqueira.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class UserRepositoryImpl(private val userRepository: UserRepository) {

    fun addUser(user: User): ResponseEntity<User> =
        ResponseEntity.ok(userRepository.save(user))

    fun findAll(): List<User> = userRepository.findAll()
}