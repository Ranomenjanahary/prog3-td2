package com.ralobo.prog3td2.controller;

import com.ralobo.prog3td2.controller.mapper.TeamRestMapper;
import com.ralobo.prog3td2.controller.response.CreateTeamResponse;
import com.ralobo.prog3td2.controller.response.TeamResponse;
import com.ralobo.prog3td2.model.TeamEntity;
import com.ralobo.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamRestMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeams() {
        return service.getTeams().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/teams")
    public List<TeamResponse> createPlayers(@RequestBody List<CreateTeamResponse> toCreate) {
        List<TeamEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createTeams(domain).stream()
                .map(mapper::toRest)
                .toList();
    }
}