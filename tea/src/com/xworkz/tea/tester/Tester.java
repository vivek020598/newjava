package com.xworkz.tea.tester;

import com.xworkz.tea.dto.Income;
import com.xworkz.tea.dto.StartUp;

public class Tester {
    public static void main(String[] args) {
        Income income = new Income("5lakh");
        StartUp startUp = new StartUp("tealeaf","vivek",income);
        System.out.println(startUp);
    }
}