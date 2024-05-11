package com.xworkz.ice.tester;

import com.xworkz.ice.dto.CompanyDto;
import com.xworkz.ice.dto.IcecreamDto;
import com.xworkz.ice.dto.IcecreamDto;
import com.xworkz.ice.dto.CompanyDto;
import com.xworkz.ice.dto.IcecreamDto;

public class Tester {
    public static void main(String[] args) {
        CompanyDto companyDto = new CompanyDto("amul" , "vivek");

        IcecreamDto icecreamDto = new IcecreamDto("chclt" , 20 , companyDto);

        System.out.println(icecreamDto);

        System.out.println(icecreamDto.getCompanyIce().getCompanyName());

    }
}
