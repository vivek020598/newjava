package com.xworkz.icecream.service;

import com.xworkz.icecream.icecreamDto.IcecreamDto;

public interface IcecreamService {
    boolean validateAndSave(IcecreamDto icecreamDto);
}
