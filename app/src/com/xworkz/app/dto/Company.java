package com.xworkz.app.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private String name;
    private String location;
    private Department department;
}
