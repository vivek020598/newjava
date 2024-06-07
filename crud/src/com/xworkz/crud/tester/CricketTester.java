package com.xworkz.crud.tester;

import com.xworkz.crud.dto.CricketDto;

import java.util.LinkedList;
import java.util.List;

public class CricketTester {
    public static void main(String[] args) {
        List<CricketDto> players = new LinkedList<>();

        players.add(new CricketDto("Sachin Tendulkar", "India", 463, 18426, 154));
        players.add(new CricketDto("Ricky Ponting", "Australia", 375, 13704, 123));
        players.add(new CricketDto("Kumar Sangakkara", "Sri Lanka", 404, 14234, 0));
        players.add(new CricketDto("Sanath Jayasuriya", "Sri Lanka", 445, 13430, 323));
        players.add(new CricketDto("Mahela Jayawardene", "Sri Lanka", 448, 12650, 8));
        players.add(new CricketDto("Brian Lara", "West Indies", 299, 10405, 4));
        players.add(new CricketDto("Rahul Dravid", "India", 344, 10889, 4));
        players.add(new CricketDto("Jacques Kallis", "South Africa", 328, 11579, 273));
        players.add(new CricketDto("Adam Gilchrist", "Australia", 287, 9619, 0));
        players.add(new CricketDto("Sourav Ganguly", "India", 311, 11363, 100));
        players.add(new CricketDto("Ricky Ponting", "Australia", 375, 13704, 123));
        players.add(new CricketDto("Shaun Pollock", "South Africa", 303, 3781, 393));
        players.add(new CricketDto("Sachin Tendulkar", "India", 463, 18426, 154));
        players.add(new CricketDto("Inzamam-ul-Haq", "Pakistan", 378, 11739, 3));
        players.add(new CricketDto("Steve Waugh", "Australia", 325, 7569, 195));
        players.add(new CricketDto("Chris Gayle", "West Indies", 301, 10345, 165));
        players.add(new CricketDto("Muttiah Muralitharan", "Sri Lanka", 350, 674, 534));
        players.add(new CricketDto("Shoaib Akhtar", "Pakistan", 163, 544, 247));
        players.add(new CricketDto("Virender Sehwag", "India", 251, 8273, 96));
        players.add(new CricketDto("Glenn McGrath", "Australia", 250, 1150, 381));

        for (CricketDto player : players) {
            System.out.println(player);
        }
    }
}
