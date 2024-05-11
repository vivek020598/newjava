package com.xworkz.app.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private int departmentId;
    private String departmentName;

    private EmployeeDetails employeeDetails;

}
