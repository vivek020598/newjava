package com.xworkz.game.service;

import com.xworkz.game.dto.GameDto;

public interface GameService {
    boolean validateAndSave(GameDto gameDto);
}
