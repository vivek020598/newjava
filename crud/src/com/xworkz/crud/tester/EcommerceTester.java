package com.xworkz.crud.tester;

import com.xworkz.crud.dto.EcommerceDto;

import java.util.LinkedList;
import java.util.List;

public class EcommerceTester {
    public static void main(String[] args) {
        List<EcommerceDto> products = new LinkedList<>();

        products.add(new EcommerceDto("iPhone 12", "Electronics", 999.99, 100, 4.8, "Apple Store", "APL123", "Latest iPhone model", "Apple Inc.", "1 year"));
        products.add(new EcommerceDto("Samsung Galaxy S21", "Electronics", 799.99, 150, 4.6, "Samsung Store", "SAM456", "Latest Galaxy model", "Samsung Electronics", "1 year"));
        products.add(new EcommerceDto("MacBook Pro", "Electronics", 1299.99, 50, 4.9, "Apple Store", "APL789", "Latest MacBook model", "Apple Inc.", "1 year"));
        products.add(new EcommerceDto("Sony WH-1000XM4", "Electronics", 349.99, 200, 4.7, "Sony Store", "SON123", "Noise Cancelling Headphones", "Sony Corporation", "2 years"));
        products.add(new EcommerceDto("Dell XPS 13", "Electronics", 999.99, 75, 4.5, "Dell Store", "DEL456", "Ultrabook Laptop", "Dell Inc.", "1 year"));

        products.add(new EcommerceDto("Nike Air Max 270", "Fashion", 150.00, 300, 4.4, "Nike Store", "NIK123", "Popular running shoes", "Nike Inc.", "6 months"));
        products.add(new EcommerceDto("Adidas Ultraboost", "Fashion", 180.00, 250, 4.6, "Adidas Store", "ADI456", "Comfortable running shoes", "Adidas AG", "6 months"));
        products.add(new EcommerceDto("Sony PlayStation 5", "Electronics", 499.99, 80, 4.8, "Sony Store", "SON789", "Next-gen gaming console", "Sony Corporation", "1 year"));
        products.add(new EcommerceDto("Microsoft Xbox Series X", "Electronics", 499.99, 90, 4.7, "Microsoft Store", "MSO123", "Next-gen gaming console", "Microsoft Corporation", "1 year"));
        products.add(new EcommerceDto("LG OLED55CXPUA", "Electronics", 1499.99, 60, 4.9, "LG Store", "LG123", "55-inch 4K OLED TV", "LG Electronics", "2 years"));

        products.add(new EcommerceDto("Bose QuietComfort 35 II", "Electronics", 299.99, 180, 4.7, "Bose Store", "BOS456", "Noise Cancelling Headphones", "Bose Corporation", "1 year"));
        products.add(new EcommerceDto("KitchenAid Stand Mixer", "Home & Kitchen", 379.99, 110, 4.8, "KitchenAid Store", "KIT789", "Popular stand mixer", "KitchenAid", "1 year"));
        products.add(new EcommerceDto("Dyson V11 Vacuum", "Home & Kitchen", 599.99, 90, 4.7, "Dyson Store", "DYS123", "Cordless vacuum cleaner", "Dyson Ltd.", "2 years"));
        products.add(new EcommerceDto("Instant Pot Duo 7-in-1", "Home & Kitchen", 89.99, 220, 4.6, "Instant Pot Store", "INS456", "Multi-use pressure cooker", "Instant Brands", "1 year"));
        products.add(new EcommerceDto("Nespresso VertuoPlus", "Home & Kitchen", 159.99, 130, 4.7, "Nespresso Store", "NES789", "Coffee and espresso machine", "Nestlé", "1 year"));

        products.add(new EcommerceDto("Apple Watch Series 6", "Electronics", 399.99, 120, 4.8, "Apple Store", "APL456", "Smartwatch with health tracking", "Apple Inc.", "1 year"));
        products.add(new EcommerceDto("Fitbit Charge 4", "Electronics", 149.99, 140, 4.6, "Fitbit Store", "FIT123", "Fitness and activity tracker", "Fitbit Inc.", "1 year"));
        products.add(new EcommerceDto("Canon EOS R5", "Electronics", 3899.00, 40, 4.8, "Canon Store", "CAN456", "Full-frame mirrorless camera", "Canon Inc.", "1 year"));
        products.add(new EcommerceDto("GoPro HERO9 Black", "Electronics", 399.99, 110, 4.7, "GoPro Store", "GOP123", "Action camera", "GoPro Inc.", "1 year"));
        products.add(new EcommerceDto("Kindle Paperwhite", "Electronics", 129.99, 200, 4.8, "Amazon Store", "AMZ456", "E-reader", "Amazon", "1 year"));

        for (EcommerceDto product : products) {
            System.out.println(product);
        }
    }
}
