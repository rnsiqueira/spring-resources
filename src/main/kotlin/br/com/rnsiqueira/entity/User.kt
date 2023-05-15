package br.com.rnsiqueira.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @Column(name = "username", nullable = false)
    val name: String,
    @Column(name = "password")
    val password: String,
    @Column(name = "enabled")
    val enabled: Boolean? = null
)
