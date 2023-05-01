package br.com.rnsiqueira.service

import br.com.rnsiqueira.entity.User
import br.com.rnsiqueira.repository.UserRepository
import br.com.rnsiqueira.repository.UserService
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) : UserService {
    override fun getUsers(): List<User> = userRepository.findAll()

    override fun saveUser(user: User) {
        userRepository.save(user)
    }
}