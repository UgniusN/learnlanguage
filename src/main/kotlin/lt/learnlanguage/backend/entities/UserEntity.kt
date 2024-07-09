package lt.learnlanguage.backend.entities

import jakarta.persistence.*

@Entity(name = "users")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    @Column(nullable = false)
    val name: String = "",
    @Column(nullable = true)
    val googleId: String? = null,
    @Column(nullable = true)
    val appleId: String? = null,
    @Column(nullable = false)
    val uuid: String? = null,
    @Column(nullable = false)
    val points: Int,
) {
    constructor() : this(id = null, name = "", googleId = "", appleId = "", points = 0)
}