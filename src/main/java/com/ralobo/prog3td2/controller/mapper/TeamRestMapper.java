package com.ralobo.prog3td2.controller.mapper;

import com.ralobo.prog3td2.controller.response.CreatePlayerResponse;
import com.ralobo.prog3td2.controller.response.CreateTeamResponse;
import com.ralobo.prog3td2.controller.response.TeamResponse;
import com.ralobo.prog3td2.model.PlayerEntity;
import com.ralobo.prog3td2.model.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(TeamEntity domain) {
        return TeamResponse.builder()
                .id(String.valueOf(Math.toIntExact(domain.getId())))
                .name(domain.getName())
                .build();
    }
    public TeamEntity toDomain(CreateTeamResponse rest) {
        return TeamEntity.builder()
                .name(rest.getName())
                .build();
    }
}