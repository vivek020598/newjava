package com.xworkz.cricket.tester;

import com.xworkz.cricket.constant.CricketName;
import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.service.CricketService;
import com.xworkz.cricket.service.CricketServiceImplements;

public class CricketTester {
    public static void main(String[] args) {
        CricketDto cricketDto = new CricketDto(
                CricketName.INDIA.toString(),
                "Rohit Sharma",
                11
        );
        System.out.println(cricketDto);
        CricketService cricketService = new CricketServiceImplements();
        boolean isValid = cricketService.validateAndSave(cricketDto);
    }
}
