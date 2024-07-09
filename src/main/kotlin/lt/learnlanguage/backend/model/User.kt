package lt.learnlanguage.backend.model

import lt.learnlanguage.backend.entities.UserEntity

data class User(
    val uuid: String,
    val name: String,
) {
    constructor(entity: UserEntity) : this(
        uuid = entity.uuid.toString(),
        name = entity.name
    )
}