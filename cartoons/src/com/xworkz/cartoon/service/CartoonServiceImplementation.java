package com.xworkz.cartoon.service;

import com.xworkz.cartoon.cartoonDto.CartoonsDto;

public class CartoonServiceImplementation implements CartoonService {
    @Override
    public boolean validateAndSave(CartoonsDto cartoonsDto){
        if(cartoonsDto != null){
            System.out.println("not null");
            return true;
        }
        return false;
    }
}
