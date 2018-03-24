package com.example.android.designpatterns.structural.adapter;

/**
 * Created by rynel on 3/24/2018.
 */

public class GameObjectReporter implements GameInfo {

    GameReporter gameReporter;

    public GameObjectReporter() {
        gameReporter = new GameReporter();
    }

    @Override

    public String getGameName() {
        return gameReporter.getGameName();
    }

    @Override
    public void setGameName(String gameName) {
        gameReporter.setGameName(gameName);
    }

    @Override
    public String getGameGenre() {
        return gameReporter.getGameGenre();
    }

    @Override
    public void setGameGenre(String gameGenre) {
        gameReporter.setGameGenre(gameGenre);
    }
}
