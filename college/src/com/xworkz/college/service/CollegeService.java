package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDto;

public interface CollegeService {
    boolean validateAndSave(CollegeDto collegeDto);
}
