package com.ralobo.prog3td2.repository;

import com.ralobo.prog3td2.model.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchEntity, Integer> {
}
