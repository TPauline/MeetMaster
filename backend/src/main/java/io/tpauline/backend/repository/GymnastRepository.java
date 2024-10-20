package io.tpauline.backend.repository;

import io.tpauline.backend.model.Gymnast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymnastRepository extends JpaRepository<Gymnast, Long> {
}