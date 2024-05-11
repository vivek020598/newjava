package com.xworkz.app.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseApplication extends Application{
    private String appName;

    private TechnicalSkills technicalSkills;
    private Company company;
}
