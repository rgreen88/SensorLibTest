package com.example.android.designpatterns.creational.builder;

/**
 * Created by rynel on 3/24/2018.
 */

public class Game {


    private String game;
    private String console;
    private String accessory;

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String toString() {
        return "game:" + game + ", console:" + console + ", accessory:" + accessory;
    }
}
