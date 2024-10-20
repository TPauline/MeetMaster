package io.tpauline.backend.controller;

import io.tpauline.backend.model.Gymnast;
import io.tpauline.backend.repository.GymnastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gymnasts")
public class GymnastController {

    @Autowired
    private GymnastRepository repository;

    @GetMapping
    public List<Gymnast> getAllGymnasts() {
        return repository.findAll();
    }

    @PostMapping
    public Gymnast createGymnast(@RequestBody Gymnast gymnast) {
        return repository.save(gymnast);
    }

    @GetMapping("/{id}")
    public Gymnast getGymnastById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Gymnast updateGymnast(@PathVariable Long id, @RequestBody Gymnast updatedGymnast) {
        Gymnast gymnast = repository.findById(id).orElseThrow();
        gymnast.setName(updatedGymnast.getName());
        gymnast.setLevel(updatedGymnast.getLevel());
        gymnast.setTeam(updatedGymnast.getTeam());
        return repository.save(gymnast);
    }
}
