package io.tpauline.backend.controller;

import io.tpauline.backend.model.Score;
import io.tpauline.backend.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scores")
public class ScoreController {

    @Autowired
    private ScoreRepository repository;

    @GetMapping
    public List<Score> getAllScores() {
        return repository.findAll();
    }

    @PostMapping
    public Score createScore(@RequestBody Score score) {
        return repository.save(score);
    }
}
