package com.example.android.designpatterns.structural.adapter;

/**
 * Created by rynel on 3/24/2018.
 */

public class GameAdapterDemo {

    public static void main(String[] args) {

        // class adapter
        System.out.println("class adapter test");
        GameInfo gameInfo = new GameClassReporter();
        testGameInfo(gameInfo);

        // object adapter
        System.out.println("\nobject adapter test");
        gameInfo = new GameObjectReporter();
        testGameInfo(gameInfo);

    }

    public static void testGameInfo(GameInfo gameInfo) {
        gameInfo.setGameGenre("RPG");
        System.out.println("Game:" + gameInfo.getGameGenre());
        System.out.println("Genre:" + gameInfo.getGameName());


    }
}
