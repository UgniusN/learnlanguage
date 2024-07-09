package lt.learnlanguage.backend.controller

import lt.learnlanguage.backend.controller.requests.RegisterUserRequest
import lt.learnlanguage.backend.model.User
import lt.learnlanguage.backend.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController @Autowired constructor(
    private val userService: UserService
): BaseController() {

    @PostMapping("/register")
    fun register(@RequestBody request: RegisterUserRequest): User {
        return userService.register(
            name = request.name,
            googleStoreId = request.googleId,
            appleStoreId = request.appleId
        )
    }

    @GetMapping("/test")
    fun getTester(): User {
        return User(uuid = "", name = "")
    }
}