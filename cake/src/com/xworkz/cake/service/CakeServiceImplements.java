package com.xworkz.cake.service;

import com.xworkz.cake.dto.CakeDto;

public class CakeServiceImplements implements CakeService {

    @Override
    public boolean validateAndSave(CakeDto cakeDto) {
        if (cakeDto != null) {
            System.out.println("The cake is not null");
            return true;
        }
        return false;
    }
}
