package com.xworkz.icecream.icecreamDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IcecreamDto {

    private String flavor;
    private String iceCreamName;
    private int weight; // In grams

    @Override
    public String toString() {
        return "Flavor: " + flavor + ", Ice Cream Name: " + iceCreamName + ", Weight: " + weight + " grams";
    }
}
