package com.example.android.designpatterns.creational.builder;

/**
 * Created by rynel on 3/24/2018.
 */

public interface GameBuilder {

    void buildGame();
    void buildConsole();
    void buildAccessory();

    public Game getGameBuilder();

}
