package com.xworkz.ice.dto;


import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class IcecreamDto extends ShopDto {

    private String  iceCreamFlavour;
    private  int price;

    private CompanyDto companyIce;


}
