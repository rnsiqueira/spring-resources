package br.com.rnsiqueira.repository

import br.com.rnsiqueira.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, String> {
    fun findByUserNameAndPassword(
        userName: String,
        password: String,
    ): User
}
