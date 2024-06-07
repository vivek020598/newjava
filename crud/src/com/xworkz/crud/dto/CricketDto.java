package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CricketDto {
    private String player;
    private String country;
    private int matchesPlayed;
    private int runsScored;
    private int wicketsTaken;
}
