package com.xworkz.cake.cakeDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CakeDto {

    private String cakeType;
    private String cakeName;
    private double weight; // In kilograms

    @Override
    public String toString() {
        return "Cake Type: " + cakeType + ", Cake Name: " + cakeName + ", Weight: " + weight + " kg";
    }
}
