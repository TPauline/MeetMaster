package io.tpauline.backend.controller;

import io.tpauline.backend.model.Meet;
import io.tpauline.backend.repository.MeetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meets")
public class MeetController {

    @Autowired
    private MeetRepository repository;

    @GetMapping
    public List<Meet> getAllMeets() {
        return repository.findAll();
    }

    @PostMapping
    public Meet createMeet(@RequestBody Meet meet) {
        return repository.save(meet);
    }

    @GetMapping("/{id}")
    public Meet getMeetById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }
}
