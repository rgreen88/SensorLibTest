package com.example.android.designpatterns.creational.builder;

/**
 * Created by rynel on 3/24/2018.
 */

public class GameDirector {

    private GameBuilder gameBuilder = null;

    public GameDirector (GameBuilder gameBuilder){
        this.gameBuilder = gameBuilder;
    }

    public void constructGame(){
        gameBuilder.buildAccessory();
        gameBuilder.buildConsole();
        gameBuilder.buildGame();
    }

    public Game getGame(){
        return gameBuilder.getGameBuilder();
    }
}
