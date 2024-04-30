package com.xworkz.cake.tester;

import com.xworkz.cake.constant.CakeName;
import com.xworkz.cake.dto.CakeDto;
import com.xworkz.cake.service.CakeService;
import com.xworkz.cake.service.CakeServiceImplements;

public class CakeTester {
    public static void main(String[] args) {
        CakeDto cakeDto = new CakeDto(
                CakeName.CHOCOLATE.toString(),
                "Black Forest",
                1.5
        );

        System.out.println(cakeDto);

        CakeService cakeService = new CakeServiceImplements();
        boolean isValid = cakeService.validateAndSave(cakeDto);
    }
}
