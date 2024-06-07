package com.xworkz.crud.tester;

import com.xworkz.crud.dto.CollegeDto;
import com.xworkz.crud.dto.HospitalDto;

import java.util.ArrayList;
import java.util.List;

public class HospitalTester {
    public static void main(String[] args) {
    List<HospitalDto> a=new ArrayList<HospitalDto>();
    a.add(new HospitalDto("vinayaka","bangalore","private","vivek"));
    a.add(new HospitalDto("siddhartha","mangalore","government","suni"));
    a.add(new HospitalDto("siddaganga","tumkur","government","sumi"));
    a.add(new HospitalDto("nidhi","mysore","private","teja"));
    a.add(new HospitalDto("varun","gadag","government","nanda"));

        a.add(new HospitalDto("sri devi","mudhol","private","mahi"));
        a.add(new HospitalDto("nandhi","hassan","government","nutu"));
        a.add(new HospitalDto("aadhya","chenraypatna","private","ganga"));
        a.add(new HospitalDto("aradhya","kunigal","government","deeri"));
        a.add(new HospitalDto("nimhans","yadiyur","private","madhu"));

        a.add(new HospitalDto("shivu","bidadi","government","chethu"));
        a.add(new HospitalDto("lasya","kormangla","private","abhi"));
        a.add(new HospitalDto("aruna","nelmangla","government","naveen"));
        a.add(new HospitalDto("adithya","hiriyur","private","suresh"));
        a.add(new HospitalDto("tjohn","sira","government","mady"));

        a.add(new HospitalDto("sneha","maddur","private","nandhish"));
        a.add(new HospitalDto("vinayaka","mandya","government","kalyan"));
        a.add(new HospitalDto("arvind","belur","private","david"));
        a.add(new HospitalDto("nanjundeshwara","gubbi","government","ajay"));
        a.add(new HospitalDto("nandus","nittur","private","arun"));

        for(HospitalDto abc : a){
            System.out.println(abc);
        }

        System.out.println(a.remove(19));
        System.out.println(a);

        System.out.println(a.size());
        System.out.println(a.lastIndexOf(new HospitalDto("nandus","nittur","private","arun")));
    }
}
