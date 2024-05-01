package com.xworkz.river.repository;

import com.xworkz.river.dto.RiverDto;

public class RiverRepositoryImplementation implements RiverRepository {
    private RiverDto[] dtos = new RiverDto[10]; // Maximum 10 rivers
    private int index = 0;

    @Override
    public boolean save(RiverDto riverDto) {
        if (index < dtos.length) {
            dtos[index++] = riverDto; // Store the RiverDto in the array
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }
}
