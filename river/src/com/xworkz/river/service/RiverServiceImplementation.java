package com.xworkz.river.service;

import com.xworkz.river.dto.RiverDto;
import com.xworkz.river.repository.RiverRepository;
import com.xworkz.river.repository.RiverRepositoryImplementation;

public class RiverServiceImplementation implements RiverService {
    private RiverRepository riverRepository = new RiverRepositoryImplementation();

    @Override
    public boolean validateAndSave(RiverDto riverDto) {
        if (riverDto != null) {
            if (riverDto.getRiverName() != null && riverDto.getLength() > 0 && riverDto.getCountry() != null) {
                boolean saved = riverRepository.save(riverDto);
                if (saved) {
                    System.out.println("River saved successfully");
                    return true;
                }
            } else {
                System.out.println("Invalid RiverDto fields");
            }
        }
        return false;
    }
}
