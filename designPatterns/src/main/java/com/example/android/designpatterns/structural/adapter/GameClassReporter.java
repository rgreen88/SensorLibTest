package com.example.android.designpatterns.structural.adapter;

/**
 * Created by rynel on 3/24/2018.
 */

public class GameClassReporter extends GameReporter implements GameInfo{
    @Override
    public String getGameName() {
        return gameName; //Game Reporter class object variable
    }

    @Override
    public void setGameName(String gameName) {

    }

    @Override
    public String getGameGenre() {
        return gameGenre;
    }

    @Override
    public void setGameGenre(String gameGenre) {

    }
}
