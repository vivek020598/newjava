package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoftwareDto {
    private String name;
    private String version;
    private String developer;
    private String releaseDate;
    private String licenseType;
}
