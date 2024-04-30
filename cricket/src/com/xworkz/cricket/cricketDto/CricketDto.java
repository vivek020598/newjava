package com.xworkz.cricket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CricketDto {

    private String teamName;
    private String captain;
    private int numberOfPlayers;

    @Override
    public String toString() {
        return "Team Name: " + teamName + ", Captain: " + captain + ", Number of Players: " + numberOfPlayers;
    }
}
