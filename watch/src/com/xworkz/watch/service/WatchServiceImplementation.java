package com.xworkz.watch.service;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repository.WatchRepository;
import com.xworkz.watch.repository.WatchRepositoryImplementation;

public class WatchServiceImplementation implements WatchService {
    private WatchRepository watchRepository = new WatchRepositoryImplementation();

    @Override
    public boolean validateAndSave(WatchDto watchDto) {
        if (watchDto != null) {
            if (watchDto.getWatchName() != null && watchDto.getPrice() > 0 && watchDto.getBrand() != null) {
                boolean saved = watchRepository.save(watchDto);
                if (saved) {
                    System.out.println("Watch saved successfully");
                    return true;
                }
            } else {
                System.out.println("Invalid WatchDto fields");
            }
        }
        return false;
    }
}
