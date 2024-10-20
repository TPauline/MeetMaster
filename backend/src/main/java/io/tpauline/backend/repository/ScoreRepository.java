package io.tpauline.backend.repository;

import io.tpauline.backend.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
