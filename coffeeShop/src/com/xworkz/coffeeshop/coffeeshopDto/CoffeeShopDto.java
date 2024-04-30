package com.xworkz.coffeeshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeShopDto {

    private String shopName;
    private String address;
    private int numberOfEmployees;

    @Override
    public String toString() {
        return "Shop Name: " + shopName + ", Address: " + address + ", Number of Employees: " + numberOfEmployees;
    }
}
