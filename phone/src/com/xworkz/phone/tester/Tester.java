package com.xworkz.phone.tester;

import com.xworkz.phone.dto.ApplicationDto;
import com.xworkz.phone.dto.IphoneDto;

public class Tester {
    public static void main(String[] args) {
        ApplicationDto applicationDto = new ApplicationDto("insta","70mb");
        IphoneDto iphoneDto = new IphoneDto("13a","13promax",applicationDto);
        System.out.println(iphoneDto);
    }
}
