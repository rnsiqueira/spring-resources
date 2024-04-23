package br.com.rnsiqueira.security.service

import br.com.rnsiqueira.repository.UserRepository
import br.com.rnsiqueira.repository.UserService
import br.com.rnsiqueira.security.entity.User
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) : UserService {
    override fun getUsers(): List<User> = userRepository.findAll()

    override fun saveUser(user: User) {
        userRepository.save(user)
    }

    override fun takeUser(
        userName: String,
        password: String,
    ): User {
        return userRepository.findByUserNameAndPassword(userName, password)
    }
}
