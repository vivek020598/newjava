package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HospitalDto {
    private String name;
    private String address;
    private String hospitalType;
    private String ownerName;
}
