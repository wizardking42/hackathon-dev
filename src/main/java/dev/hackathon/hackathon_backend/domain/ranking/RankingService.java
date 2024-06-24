package dev.hackathon.hackathon_backend.domain.ranking;

import dev.hackathon.hackathon_backend.domain.AthleteDataReader;
import dev.hackathon.hackathon_backend.domain.AthletePerformance;

import java.util.List;

public class RankingService {
    List<AthletePerformance> getRanking() {
        List<AthletePerformance> performances = new AthleteDataReader().readData();
        performances.sort((p1, p2) -> {
            if (p1.getPoints() > p2.getPoints()) {
                return -1;
            } else if (p1.getPoints() < p2.getPoints()) {
                return 1;
            } else {
                return 0;
            }
        });
        return performances;
    }

    // Create a method to rank
}
