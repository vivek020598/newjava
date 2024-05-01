package com.xworkz.college.repository;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepositoryImplementation implements CollegeRepository {
    private CollegeDto[] dtos = new CollegeDto[10]; // Maximum 10 colleges
    private int index = 0;

    @Override
    public boolean save(CollegeDto collegeDto) {
        if (index < dtos.length) {
            dtos[index++] = collegeDto; // Store the CollegeDto in the array
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }
}
