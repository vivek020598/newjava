package com.xworkz.crud.tester;

import com.xworkz.crud.dto.PlaceDto;

import java.util.ArrayList;
import java.util.List;

public class PlaceTester {
    public static void main(String[] args) {
        List<PlaceDto> places = new ArrayList<>();

        places.add(new PlaceDto("Taj Mahal", "Agra"));
        places.add(new PlaceDto("Qutub Minar", "Delhi"));
        places.add(new PlaceDto("Red Fort", "Delhi"));
        places.add(new PlaceDto("Gateway of India", "Mumbai"));
        places.add(new PlaceDto("Mysore Palace", "Mysore"));

        places.add(new PlaceDto("Charminar", "Hyderabad"));
        places.add(new PlaceDto("India Gate", "Delhi"));
        places.add(new PlaceDto("Hawa Mahal", "Jaipur"));
        places.add(new PlaceDto("Ajanta Caves", "Maharashtra"));
        places.add(new PlaceDto("Ellora Caves", "Maharashtra"));

        places.add(new PlaceDto("Sun Temple", "Konark"));
        places.add(new PlaceDto("Golden Temple", "Amritsar"));
        places.add(new PlaceDto("Meenakshi Temple", "Madurai"));
        places.add(new PlaceDto("Ranthambore", "Rajasthan"));
        places.add(new PlaceDto("Kaziranga", "Assam"));

        places.add(new PlaceDto("Backwaters", "Kerala"));
        places.add(new PlaceDto("Manali", "Himachal Pradesh"));
        places.add(new PlaceDto("Goa Beaches", "Goa"));
        places.add(new PlaceDto("Jaisalmer Fort", "Jaisalmer"));
        places.add(new PlaceDto("Victoria Memorial", "Kolkata"));

        for (PlaceDto place : places) {
            System.out.println(place);
        }
    }
}
