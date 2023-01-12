package com.ralobo.prog3td2.controller.mapper;

import com.ralobo.prog3td2.controller.response.MatchResponse;
import com.ralobo.prog3td2.model.MatchEntity;
import com.ralobo.prog3td2.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private final MatchService matchService;
    public MatchResponse toRest(MatchResponse entity) {
        return MatchResponse.builder()
                .id(entity.getId())
                .dateTime(entity.getDateTime())
                .stadium(entity.getStadium())
                .teamA(new MatchEntity())
                .teamB(new MatchEntity())
                .build();
    }
}
