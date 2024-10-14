package xyz.milesync.app.domain

import jakarta.persistence.*

@Entity
@Table(name = "\"user\"")
data class User(
    @Id
    @Column(name = "id",unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String,

    @Column(name = "firstName", nullable = false)
    val firstName: String,

    @Column(name = "lastName", nullable = false)
    val lastName: String,

    @Column(name = "username", nullable = false, unique = true)
    val username: String,

    @Column(name = "email", nullable = false)
    val email: String,

    @Column(name = "password", nullable = false)
    val password: String,
)
