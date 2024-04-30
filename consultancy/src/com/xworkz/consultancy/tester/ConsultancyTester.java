package com.xworkz.consultancy.tester;

import com.xworkz.consultancy.constant.ConsultancyType;
import com.xworkz.consultancy.dto.ConsultancyDto;
import com.xworkz.consultancy.service.ConsultancyService;
import com.xworkz.consultancy.service.ConsultancyServiceImplements;

public class ConsultancyTester {
    public static void main(String[] args) {
        ConsultancyDto consultancyDto = new ConsultancyDto(
                ConsultancyType.MANAGEMENT.toString(),
                "Tech Solution",
                "vivek"
        );

        System.out.println(consultancyDto);

        ConsultancyService consultancyService = new ConsultancyServiceImplements();
        boolean isValid = consultancyService.validateAndSave(consultancyDto);
    }
}
