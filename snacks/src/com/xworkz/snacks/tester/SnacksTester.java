package com.xworkz.snacks.tester;
import com.xworkz.snacks.constant.SnacksName;
import com.xworkz.snacks.snacksDto.SnacksDto;
import com.xworkz.snacks.service.SnacksService;
import com.xworkz.snacks.service.SnacksServiceImplements;

public class SnacksTester {
    public static void main(String[] args) {
        SnacksDto snacksDto = new SnacksDto(SnacksName.CHIPS.toString(),"CHIPS",10);
        System.out.println(snacksDto);
        SnacksService cartoonServiceImplementation = new SnacksServiceImplements();
        cartoonServiceImplementation.validateAndSave(snacksDto);
    }
}
