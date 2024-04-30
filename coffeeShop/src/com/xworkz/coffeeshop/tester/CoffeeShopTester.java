package com.xworkz.coffeeshop.tester;

import com.xworkz.coffeeshop.constant.CoffeeShopName;
import com.xworkz.coffeeshop.dto.CoffeeShopDto;
import com.xworkz.coffeeshop.service.CoffeeShopService;
import com.xworkz.coffeeshop.service.CoffeeShopServiceImplements;

public class CoffeeShopTester {
    public static void main(String[] args) {
        CoffeeShopDto coffeeShopDto = new CoffeeShopDto(
                CoffeeShopName.CAPPUCCINO.toString(),
                "123 Main Street",
                25
        );
        System.out.println(coffeeShopDto);
        CoffeeShopService coffeeShopService = new CoffeeShopServiceImplements();
        boolean isValid = coffeeShopService.validateAndSave(coffeeShopDto);
    }
}
