package com.xworkz.crud.tester;

import com.xworkz.crud.dto.CountryDetailsDto;

import java.util.ArrayList;
import java.util.List;

public class CountryDetailsTester {
    public static void main(String[] args) {
        List<CountryDetailsDto> countries = new ArrayList<>();

        countries.add(new CountryDetailsDto("India", "New Delhi", "Asia", 1393409038, 3287263, "INR", "Hindi", "+91"));
        countries.add(new CountryDetailsDto("United States", "Washington, D.C.", "North America", 331002651, 9833517, "USD", "English", "+1"));
        countries.add(new CountryDetailsDto("China", "Beijing", "Asia", 1444216107, 9596961, "CNY", "Chinese", "+86"));
        countries.add(new CountryDetailsDto("Japan", "Tokyo", "Asia", 126476461, 377975, "JPY", "Japanese", "+81"));
        countries.add(new CountryDetailsDto("Germany", "Berlin", "Europe", 83166711, 357022, "EUR", "German", "+49"));

        countries.add(new CountryDetailsDto("United Kingdom", "London", "Europe", 67886011, 243610, "GBP", "English", "+44"));
        countries.add(new CountryDetailsDto("France", "Paris", "Europe", 65273511, 551695, "EUR", "French", "+33"));
        countries.add(new CountryDetailsDto("Brazil", "Brasília", "South America", 213993437, 8515767, "BRL", "Portuguese", "+55"));
        countries.add(new CountryDetailsDto("Australia", "Canberra", "Australia", 25687041, 7692024, "AUD", "English", "+61"));
        countries.add(new CountryDetailsDto("Canada", "Ottawa", "North America", 37742154, 9984670, "CAD", "English, French", "+1"));

        countries.add(new CountryDetailsDto("Russia", "Moscow", "Europe/Asia", 145912025, 17098242, "RUB", "Russian", "+7"));
        countries.add(new CountryDetailsDto("South Korea", "Seoul", "Asia", 51269185, 100210, "KRW", "Korean", "+82"));
        countries.add(new CountryDetailsDto("Italy", "Rome", "Europe", 60244639, 301340, "EUR", "Italian", "+39"));
        countries.add(new CountryDetailsDto("Mexico", "Mexico City", "North America", 128932753, 1964375, "MXN", "Spanish", "+52"));
        countries.add(new CountryDetailsDto("South Africa", "Pretoria", "Africa", 59308690, 1221037, "ZAR", "English", "+27"));

        countries.add(new CountryDetailsDto("Spain", "Madrid", "Europe", 46754778, 505992, "EUR", "Spanish", "+34"));
        countries.add(new CountryDetailsDto("Indonesia", "Jakarta", "Asia", 273523615, 1904569, "IDR", "Indonesian", "+62"));
        countries.add(new CountryDetailsDto("Saudi Arabia", "Riyadh", "Asia", 34813871, 2149690, "SAR", "Arabic", "+966"));
        countries.add(new CountryDetailsDto("Argentina", "Buenos Aires", "South America", 45195774, 2780400, "ARS", "Spanish", "+54"));
        countries.add(new CountryDetailsDto("Netherlands", "Amsterdam", "Europe", 17134872, 41543, "EUR", "Dutch", "+31"));

        for (CountryDetailsDto country : countries) {
            System.out.println(country);
        }
    }
}
