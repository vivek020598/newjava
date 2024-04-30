package com.xworkz.game.tester;

import com.xworkz.game.constant.GameType;
import com.xworkz.game.dto.GameDto;
import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImplements;

public class GameTester {
    public static void main(String[] args) {
        GameDto gameDto = new GameDto(
                GameType.RPG.toString(),
                "Battlefield",
                "EA Games"
        );
        System.out.println(gameDto);
        GameService gameService = new GameServiceImplements();
        boolean isValid = gameService.validateAndSave(gameDto);
    }
}
