package com.example.android.designpatterns.creational.builder;

/**
 * Created by rynel on 3/24/2018.
 */

public class GameDemo {

    public static void main(String[] args) {

        GameBuilder gameBuilder = new NintendoBuilder();
        GameDirector gameDirector = new GameDirector(gameBuilder);
        gameDirector.constructGame();
        Game game = gameDirector.getGame();
        System.out.println("meal is: " + game);
    }
}
