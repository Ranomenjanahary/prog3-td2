package com.ralobo.prog3td2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "match")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTime;
    private String stadium;

    @ManyToMany
    @JoinColumn(name="id_teamA", nullable = false)
    private TeamEntity teamA;
    @ManyToMany
    @JoinColumn(name="id_teamB", nullable = false)
    private TeamEntity teamB;
}
