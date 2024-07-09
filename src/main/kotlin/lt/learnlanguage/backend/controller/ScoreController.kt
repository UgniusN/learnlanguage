package lt.learnlanguage.backend.controller

import lt.learnlanguage.backend.controller.requests.AddPointsRequest
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/score")
class ScoreController: BaseController() {

    @PostMapping("/add", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun addScoreToUser(@RequestBody request: AddPointsRequest) {
        println("Amogusas" + request.points)
    }
}