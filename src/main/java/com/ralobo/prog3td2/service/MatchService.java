package com.ralobo.prog3td2.service;

import com.ralobo.prog3td2.model.MatchEntity;
import com.ralobo.prog3td2.model.PlayerEntity;
import com.ralobo.prog3td2.repository.MatchRepository;
import com.ralobo.prog3td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
    private final MatchRepository repository;

    public List<MatchEntity> getMatchs() {
        return repository.findAll();
    }

    public List<MatchEntity> createMatchs(List<MatchEntity> toCreate) {
        return repository.saveAll(toCreate);
    }

    public List<MatchEntity> updateMatchs(List<MatchEntity> toUpdate) {
        return repository.saveAll(toUpdate);
    }
}
