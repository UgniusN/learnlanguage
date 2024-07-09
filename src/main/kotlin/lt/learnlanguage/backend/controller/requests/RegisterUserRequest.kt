package lt.learnlanguage.backend.controller.requests

data class RegisterUserRequest(
    val name: String,
    val googleId: String?,
    val appleId: String?,
)