package com.example.android.designpatterns.structural.adapter;

/**
 * Created by rynel on 3/24/2018.
 */

public class GameReporter {

    String gameName, gameGenre;

    public GameReporter() {
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }
}
