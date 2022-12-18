package com.ralobo.prog3td2.controller.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CreateTeamResponse {
    private String name;
}