package io.tpauline.backend.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long meetId;
    private Float maxScore;
    private int minAge;
    private int maxAge;
}
