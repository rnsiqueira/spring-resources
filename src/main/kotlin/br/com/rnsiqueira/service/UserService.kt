package br.com.rnsiqueira.service

import br.com.rnsiqueira.entity.User

interface UserService {

    fun findAll(): List<User>
    fun addUser(user: User)
}