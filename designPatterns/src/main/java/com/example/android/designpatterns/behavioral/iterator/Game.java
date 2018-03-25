package com.example.android.designpatterns.behavioral.iterator;

/**
 * Created by rynel on 3/25/2018.
 */

public class Game {

    String name;
    float price;

    public Game(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + ": $" + price;
    }
}
