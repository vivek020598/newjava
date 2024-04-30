package com.xworkz.game.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDto {

    private String gameType;
    private String gameName;
    private String developer;

    @Override
    public String toString() {
        return "Game Type: " + gameType + ", Game Name: " + gameName + ", Developer: " + developer;
    }
}
