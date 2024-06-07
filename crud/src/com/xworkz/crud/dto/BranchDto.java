package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BranchDto {
    private String branchName;
    private String managerName;
    private String location;
    private int numberOfEmployees;
    private String contactNumber;
    private String establishedDate;
}
