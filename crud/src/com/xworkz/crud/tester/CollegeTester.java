package com.xworkz.crud.tester;

import com.xworkz.crud.dto.CollegeDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollegeTester {
    public static void main(String[] args) {
        List<String> vivek= new ArrayList<String>();

        //create
        vivek.add("MSRIT");
        vivek.add("RV");
        vivek.add("BMSIT");
        vivek.add("REVA");
        vivek.add("BIT");
        vivek.add("SIT");
        vivek.add("SSIT");
        vivek.add("HMSIT");
        vivek.add("BMIT");
        vivek.add("RNSIT");
        vivek.add("CIT");
        vivek.add("MIT");

        //read
        System.out.println(vivek);

        //get
        System.out.println(vivek.get(3));

        //search
        System.out.println(vivek.contains("SIT"));

        //remove
        System.out.println(vivek.remove("MIT"));
        System.out.println(vivek.remove(8));
        System.out.println(vivek);

        //equals
        System.out.println(vivek.equals("VR"));

        //set
        System.out.println(vivek.set(1,"VIT"));
        System.out.println(vivek);

        //indexof
        System.out.println(vivek.indexOf("RNSIT"));

        //replace
       // System.out.println(vivek.replaceAll());

        //isempty
        System.out.println(vivek.isEmpty());

        //size
        System.out.println(vivek.size());

        //sort
        System.out.println();



        List<CollegeDto> college = new ArrayList<CollegeDto>();
        college.add(new CollegeDto("MSRIT","Niranjan"));
        college.add(new CollegeDto("RV","vivek"));
        college.add(new CollegeDto("SIT","suni"));
        college.add(new CollegeDto("SSIT","sumi"));
        System.out.println(college);

        for(CollegeDto abc : college){
            System.out.println(abc);
        }

        List<String> collegeName = new ArrayList<>();
        collegeName.add("AIT");
        collegeName.add("BIT");
        collegeName.add("CIT");
        collegeName.add("DIT");
        collegeName.add("EIT");

        List<String> traineeName = new ArrayList<>();
        traineeName.add("vivek");
        traineeName.add("sunil");
        traineeName.add("teja");
        traineeName.add("sumeet");
        traineeName.add("nanda");

        Collection collection = new ArrayList();
        collection.addAll(collegeName);
        collection.addAll(traineeName);

        System.out.println(collegeName);
        System.out.println(traineeName);
    }
}
