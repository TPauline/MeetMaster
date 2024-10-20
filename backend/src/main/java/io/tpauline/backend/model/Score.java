package io.tpauline.backend.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long gymnastId;
    private Long meetId;
    private Float vaultScore;
    private Float barsScore;
    private Float beamScore;
    private Float floorScore;

    @Transient
    private Float totalScore;

    @PostLoad
    @PostPersist
    public void calculateTotalScore() {
        this.totalScore = vaultScore + barsScore + beamScore + floorScore;
    }
}
