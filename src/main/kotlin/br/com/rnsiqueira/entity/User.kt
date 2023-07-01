package br.com.rnsiqueira.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users")
data class User(
    @Id
    @Column(name = "username", nullable = false)
    val name: String,
    @Column(name = "password")
    val password: String,
    @Column(name = "role")
    val role: String? = null
)
