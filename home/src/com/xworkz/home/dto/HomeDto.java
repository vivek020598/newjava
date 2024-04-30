package com.xworkz.home.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HomeDto {

    private String homeType;
    private String address;
    private int numberOfRooms;

    @Override
    public String toString() {
        return "Home Type: " + homeType + ", Address: " + address + ", Number of Rooms: " + numberOfRooms;
    }
}
