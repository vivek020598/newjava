package com.xworkz.cartoon.tester;
import com.xworkz.cartoon.constant.CartoonName;
import com.xworkz.cartoon.cartoonDto.CartoonsDto;
import com.xworkz.cartoon.service.CartoonService;
import com.xworkz.cartoon.service.CartoonServiceImplementation;

public class CartoonsTester {
    public static void main(String[] args) {
        CartoonsDto cartoonsDto = new CartoonsDto(CartoonName.TOM.toString(),"TOM",1);
        System.out.println(cartoonsDto);
        CartoonService cartoonServiceImplementation = new CartoonServiceImplementation();
        cartoonServiceImplementation.validateAndSave(cartoonsDto);
    }
}
