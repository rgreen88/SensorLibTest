package com.example.android.designpatterns.behavioral.momento;

/**
 * Created by rynel on 3/25/2018.
 */

public class GameMomentoDemo {

    public static void main(String[] args) {

        // caretaker
        GameInfoCaretaker gameInfoCaretaker = new GameInfoCaretaker();

        // originator
        GameInfo gameInfo = new GameInfo("Kingdom Hearts", 15, "RPG");
        System.out.println(gameInfo);

        gameInfo.setGamePriceAndGenre(15, "RPG");
        System.out.println(gameInfo);

        System.out.println("Saving original price for sale.");
        gameInfoCaretaker.saveState(gameInfo);

        gameInfo.setGamePriceAndGenre(10, "RPG");
        System.out.println(gameInfo);

        System.out.println("Restoring original price.");
        gameInfoCaretaker.restoreState(gameInfo);
        System.out.println(gameInfo);

    }
}
