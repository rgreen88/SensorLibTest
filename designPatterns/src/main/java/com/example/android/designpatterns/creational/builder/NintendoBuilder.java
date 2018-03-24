package com.example.android.designpatterns.creational.builder;

/**
 * Created by rynel on 3/24/2018.
 */

public class NintendoBuilder implements GameBuilder {

    private Game game;
    @Override
    public void buildGame() {

        game = new Game();

    }

    @Override
    public void buildConsole() {

        game.setConsole("Nintendo");

    }

    @Override
    public void buildAccessory() {

        game.setAccessory("Horipad Wired Controller");

    }

    @Override
    public Game getGameBuilder() {
        return game;
    }
}
