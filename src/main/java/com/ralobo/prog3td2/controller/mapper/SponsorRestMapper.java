package com.ralobo.prog3td2.controller.mapper;


import com.ralobo.prog3td2.controller.response.SponsorResponse;
import com.ralobo.prog3td2.model.SponsorEntity;
import org.springframework.stereotype.Component;

@Component
public class SponsorRestMapper {
    public SponsorResponse toRest(SponsorEntity entity) {
        return SponsorResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}