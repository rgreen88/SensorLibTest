package com.example.android.designpatterns.behavioral.momento;

/**
 * Created by rynel on 3/25/2018.
 */

public class GameInfo {

    String gameName;
    int gamePrice;
    String gameGenre;

    public GameInfo(String gameName, int gamePrice, String gameGenre) {
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.gameGenre = gameGenre;
    }

    public String toString() {
        return "Name: " + gameName + ", Price: " + gamePrice + ", gameGenre: " + gameGenre;
    }

    public void setGamePriceAndGenre(int gamePrice, String gameGenre) {
        this.gamePrice = gamePrice;
        this.gameGenre = gameGenre;
    }

    public Memento save() {
        return new Memento(gameName, gamePrice, gameGenre);
    }

    public void restore(Object objMemento) {
        Memento memento = (Memento) objMemento;
        gameName = memento.mementoGameName;
        gamePrice = memento.mementoGamePrice;
        gameGenre = memento.mementoGameGenre;
    }

    // memento - object that stores the saved state of the originator
    private class Memento {
        String mementoGameName;
        int mementoGamePrice;
        String mementoGameGenre;

        public Memento(String gameName, int gamePrice, String gameGenre) {
            mementoGameName = gameName;
            mementoGamePrice = gamePrice;
            mementoGameGenre = gameGenre;
        }
    }

}
