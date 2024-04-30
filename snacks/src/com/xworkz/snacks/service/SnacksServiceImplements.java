package com.xworkz.snacks.service;

import com.xworkz.snacks.snacksDto.SnacksDto;

public class SnacksServiceImplements implements SnacksService {

    @Override
    public boolean validateAndSave(SnacksDto snacksDto) {
        if (snacksDto != null) {
            System.out.println("The snack object is not null");
            return true;
        }
        return false;
    }
}

