package lt.learnlanguage.backend.service

import lt.learnlanguage.backend.entities.UserEntity
import lt.learnlanguage.backend.model.User
import lt.learnlanguage.backend.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService @Autowired constructor(
    private val userRepository: UserRepository
) {

    fun register(name: String, googleStoreId: String?, appleStoreId: String?): User {
        val entity = UserEntity(
            name = name,
            googleId = googleStoreId,
            appleId = appleStoreId,
            uuid = UUID.randomUUID().toString(),
            points = 0
        )
        return User(userRepository.save(entity))
    }
}