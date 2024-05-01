package com.xworkz.river.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RiverDto {
    private String riverName;
    private String country;
    private double length;
    private String source;

    @Override
    public String toString() {
        return "RiverName: " + riverName + ", Country: " + country + ", Length: " + length + " km, Source: " + source;
    }
}
