package com.xworkz.phone.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class IphoneDto extends MobileDto {

    private String series;
    private String model;

    private ApplicationDto applicationDto;
}
