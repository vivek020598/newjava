package com.xworkz.coffeeshop.service;

import com.xworkz.coffeeshop.dto.CoffeeShopDto;

public interface CoffeeShopService {

    boolean validateAndSave(CoffeeShopDto coffeeShopDto);
}
