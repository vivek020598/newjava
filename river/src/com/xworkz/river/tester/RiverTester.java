package com.xworkz.river.tester;

import com.xworkz.river.dto.RiverDto;
import com.xworkz.river.service.RiverService;
import com.xworkz.river.service.RiverServiceImplementation;

public class RiverTester {
    public static void main(String[] args) {
        RiverDto riverDto = new RiverDto("DELTA", "DELTA", 600, "Lake Victoria");
        System.out.println(riverDto);
        RiverService riverService = new RiverServiceImplementation();
        boolean result = riverService.validateAndSave(riverDto);

        System.out.println("River validation and save result: " + result);
    }
}
