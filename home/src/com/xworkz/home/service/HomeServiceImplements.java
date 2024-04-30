package com.xworkz.home.service;

import com.xworkz.home.dto.HomeDto;

public class HomeServiceImplements implements HomeService {

    @Override
    public boolean validateAndSave(HomeDto homeDto) {
        if (homeDto != null) {
            System.out.println("The home data is not null");
            return true;
        }
        return false;
    }
}
