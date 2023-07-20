package br.com.rnsiqueira.repository

import br.com.rnsiqueira.security.entity.User

interface UserService {

    fun getUsers(): List<User>

    fun saveUser(user: User)
}