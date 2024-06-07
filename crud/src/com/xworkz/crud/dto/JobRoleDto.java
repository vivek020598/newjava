package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobRoleDto {
    private String title;
    private String company;
    private String location;
    private String jobType;
    private double salary;
    private String experience;
    private String skillsRequired;
}
