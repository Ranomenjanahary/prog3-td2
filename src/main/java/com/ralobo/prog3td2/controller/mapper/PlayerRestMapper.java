package com.ralobo.prog3td2.controller.mapper;

import com.ralobo.prog3td2.controller.response.CreatePlayerResponse;
import com.ralobo.prog3td2.controller.response.PlayerResponse;
import com.ralobo.prog3td2.model.PlayerEntity;
import com.ralobo.prog3td2.model.TeamEntity;
import com.ralobo.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerRestMapper {
    private final TeamService teamService;

    public PlayerResponse toRest(PlayerEntity domain) {
        String teamName = domain.getTeam() == null ? null : domain.getTeam().getName();

        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getTeam().getName())
                .hasTeam(domain.hasTeam())
                .build();
    }
        public PlayerEntity toDomain(CreatePlayerResponse rest) {
            return PlayerEntity.builder()
                    .team((TeamEntity) teamService.getTeams())
                    .name(rest.getName())
                    .build();
    }
}