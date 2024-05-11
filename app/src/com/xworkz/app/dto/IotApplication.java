package com.xworkz.app.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class IotApplication extends Application{
    private String appName;

    private TechnicalSkills technicalSkills;
    private Company company;
}
