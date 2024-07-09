package lt.learnlanguage.backend.controller

import lt.learnlanguage.backend.model.LeaderboardEntry
import lt.learnlanguage.backend.service.LeaderboardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/leaderboard")
class LeaderboardController @Autowired constructor(
    private val leaderboardService: LeaderboardService
) {

    @GetMapping
    fun getLeaderboardEntries(): List<LeaderboardEntry> {
        return leaderboardService.getLeaderboard()
    }
}