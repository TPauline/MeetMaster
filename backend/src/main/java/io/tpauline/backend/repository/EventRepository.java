package io.tpauline.backend.repository;

import io.tpauline.backend.model.Event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
