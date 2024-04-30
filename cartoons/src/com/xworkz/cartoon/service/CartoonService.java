package com.xworkz.cartoon.service;

import com.xworkz.cartoon.cartoonDto.CartoonsDto;

public interface CartoonService {
    boolean validateAndSave(CartoonsDto cartoonsDto);
}
