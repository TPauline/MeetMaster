package io.tpauline.backend.repository;

import io.tpauline.backend.model.Meet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetRepository extends JpaRepository<Meet, Long> {
}