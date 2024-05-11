package com.xworkz.tea.dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StartUp extends TeaShop{
    private String name ;
    private String founderName;

    private Income income;
}
