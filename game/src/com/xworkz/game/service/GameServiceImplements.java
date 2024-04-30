package com.xworkz.game.service;

import com.xworkz.game.dto.GameDto;

public class GameServiceImplements implements GameService {

    @Override
    public boolean validateAndSave(GameDto gameDto) {
        if (gameDto != null) {
            System.out.println("The game data is not null");
            return true;
        }
        return false;
    }
}
