package com.xworkz.coffeeshop.service;

import com.xworkz.coffeeshop.dto.CoffeeShopDto;

public class CoffeeShopServiceImplements implements CoffeeShopService {

    @Override
    public boolean validateAndSave(CoffeeShopDto coffeeShopDto) {
        if (coffeeShopDto != null) {
            System.out.println("The coffee shop data is not null");
            return true;
        }
        return false;
    }
}
