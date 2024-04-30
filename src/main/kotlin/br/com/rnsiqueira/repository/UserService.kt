package br.com.rnsiqueira.repository

import br.com.rnsiqueira.entity.User

interface UserService {
    fun getUsers(): List<User>

    fun saveUser(user: User)

    fun takeUser(
        userName: String,
        password: String,
    ): User
}
