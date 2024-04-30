package com.xworkz.cartoon.cartoonDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartoonsDto {
    private String cartoonName;
    private String characterName;
    private int numberOfCharacters;
    @Override
    public String toString(){
        return "cartoonName is" + cartoonName + "," + "characterName is"+ characterName + "," + "numberOfCharacters is " +characterName;
    }
}
