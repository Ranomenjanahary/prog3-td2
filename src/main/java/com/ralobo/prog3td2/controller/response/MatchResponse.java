package com.ralobo.prog3td2.controller.response;

import com.ralobo.prog3td2.model.MatchEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MatchResponse {
    private int id;
    private LocalDateTime dateTime;
    private String stadium;
    private MatchEntity teamA;
    private MatchEntity teamB;
}
