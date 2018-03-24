package com.example.android.designpatterns.structural.decorator;

/**
 * Created by rynel on 3/24/2018.
 */

public abstract class GameDecorator implements Game {

    Game game;

    public GameDecorator (Game game){
        this.game = game;
    }
}
