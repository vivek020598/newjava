package com.xworkz.icecream.tester;

import com.xworkz.icecream.constant.IcecreamName;
import com.xworkz.icecream.icecreamDto.IcecreamDto;
import com.xworkz.icecream.service.IcecreamService;
import com.xworkz.icecream.service.IcecreamServiceImplements;


public class IcecreamTester {
    public static void main(String[] args) {
        IcecreamDto icecreamDto = new IcecreamDto(
                IcecreamName.CHOCOLATE.toString(),
                "Vanilla Dream",
                500
        );
        System.out.println(icecreamDto);
        IcecreamService icecreamService = new IcecreamServiceImplements();
        boolean isValid = icecreamService.validateAndSave(icecreamDto);
    }
}
