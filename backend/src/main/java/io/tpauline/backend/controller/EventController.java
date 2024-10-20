package io.tpauline.backend.controller;

import io.tpauline.backend.model.Event;
import io.tpauline.backend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventRepository repository;

    /**
     * Retrieve all events.
     * 
     * @return List of all Event objects.
     */
    @GetMapping
    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    /**
     * Create a new event.
     * 
     * @param event The Event object to be created.
     * @return The newly saved Event object.
     */
    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return repository.save(event);
    }

    /**
     * Retrieve a specific event by ID.
     * 
     * @param id The ID of the event to retrieve.
     * @return The Event object, if found.
     */
    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + id));
    }

    /**
     * Update an existing event by ID.
     * 
     * @param id           The ID of the event to update.
     * @param updatedEvent The Event object with updated details.
     * @return The updated Event object.
     */
    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event updatedEvent) {
        updatedEvent.setId(id); // Ensure the ID matches the path variable
        return repository.save(updatedEvent);
    }

    /**
     * Delete an event by ID.
     * 
     * @param id The ID of the event to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
