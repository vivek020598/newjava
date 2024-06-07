package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryDetailsDto {
    private String name;
    private String capital;
    private String continent;
    private long population;
    private double area;
    private String currency;
    private String officialLanguage;
    private String callingCode;
}
