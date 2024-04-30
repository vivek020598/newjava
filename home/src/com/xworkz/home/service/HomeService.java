package com.xworkz.home.service;

import com.xworkz.home.dto.HomeDto;

public interface HomeService {
    boolean validateAndSave(HomeDto homeDto);
}
