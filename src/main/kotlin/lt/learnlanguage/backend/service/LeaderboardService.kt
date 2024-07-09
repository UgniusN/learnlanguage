package lt.learnlanguage.backend.service

import lt.learnlanguage.backend.model.LeaderboardEntry
import lt.learnlanguage.backend.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LeaderboardService @Autowired constructor(
    private val userRepository: UserRepository
) {
    fun getLeaderboard(): List<LeaderboardEntry> {
        val leaderboardEntries = mutableListOf<LeaderboardEntry>()
        val users = userRepository.findAll()
        users.sortByDescending { it.points }
        users.forEachIndexed { index, userEntity ->
            leaderboardEntries.add(
                LeaderboardEntry(
                    pos = index + 1,
                    points = userEntity.points,
                    name = userEntity.name,
                )
            )
        }
        return leaderboardEntries
    }
}
