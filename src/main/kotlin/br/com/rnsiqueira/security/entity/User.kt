package br.com.rnsiqueira.security.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long,
    @Column(name = "username", nullable = false)
    val userName: String,
    @Column(name = "password")
    val password: String,
    @Column(name = "role")
    val role: String? = null,
)
