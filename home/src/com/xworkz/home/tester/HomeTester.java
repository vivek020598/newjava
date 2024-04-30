package com.xworkz.home.tester;

import com.xworkz.home.constant.HomeType;
import com.xworkz.home.dto.HomeDto;
import com.xworkz.home.service.HomeService;
import com.xworkz.home.service.HomeServiceImplements;

public class HomeTester {
    public static void main(String[] args) {
        HomeDto homeDto = new HomeDto(
                HomeType.HOUSE.toString(),
                "1 bangalore",
                4
        );
        System.out.println(homeDto);
        HomeService homeService = new HomeServiceImplements();
        boolean isValid = homeService.validateAndSave(homeDto);
    }
}
