package com.xworkz.crud.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EcommerceDto {
    private String productName;
    private String category;
    private double price;
    private int quantity;
    private double rating;
    private String seller;
    private String productId;
    private String description;
    private String manufacturer;
    private String warranty;
}
