package com.xworkz.river.service;

import com.xworkz.river.dto.RiverDto;

public interface RiverService {
    boolean validateAndSave(RiverDto riverDto);
}
