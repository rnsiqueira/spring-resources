package br.com.rnsiqueira.entity

import jakarta.persistence.*

@Entity
@Table(name = "USERS")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null,
    @Column(name = "name", nullable = false)
    val name: String,
    @Column(name = "password")
    val password: String
)
