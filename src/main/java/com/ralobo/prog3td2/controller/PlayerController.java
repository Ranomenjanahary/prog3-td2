package com.ralobo.prog3td2.controller;

import com.ralobo.prog3td2.controller.mapper.PlayerRestMapper;
import com.ralobo.prog3td2.controller.response.CreatePlayerResponse;
import com.ralobo.prog3td2.controller.response.PlayerResponse;
import com.ralobo.prog3td2.model.PlayerEntity;
import com.ralobo.prog3td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerRestMapper mapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers() {
        return service.getPlayers().stream()
                .map(mapper::toRest)
                .toList();
    }
    @PostMapping("/players")
    public List<PlayerResponse> createPlayers(@RequestBody List<CreatePlayerResponse> toCreate) {
        List<PlayerEntity> domain = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return service.createPlayers(domain).stream()
                .map(mapper::toRest)
                .toList();
    }
}