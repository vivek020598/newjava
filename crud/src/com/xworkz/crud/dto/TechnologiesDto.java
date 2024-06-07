package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TechnologiesDto {
    private String name;
    private String type;
    private String description;
    private String language;
    private String framework;
    private String version;
    private String developer;
    private String releaseDate;
}
