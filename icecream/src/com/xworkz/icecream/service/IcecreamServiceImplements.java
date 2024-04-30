package com.xworkz.icecream.service;

import com.xworkz.icecream.icecreamDto.IcecreamDto;

public class IcecreamServiceImplements implements IcecreamService {

    @Override
    public boolean validateAndSave(IcecreamDto iceCreamDto) {
        if (iceCreamDto != null) {
            System.out.println("The ice cream data is not null");
            return true;
        }
        return false;
    }
}
