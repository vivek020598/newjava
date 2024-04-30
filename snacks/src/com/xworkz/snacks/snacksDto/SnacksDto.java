package com.xworkz.snacks.snacksDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SnacksDto {

    private String snackName;
    private String mainIngredient;
    private int quantity; // In grams or number of units

    @Override
    public String toString() {
        return "Snack Name: " + snackName + ", Main Ingredient: " + mainIngredient + ", Quantity: " + quantity;
    }
}
