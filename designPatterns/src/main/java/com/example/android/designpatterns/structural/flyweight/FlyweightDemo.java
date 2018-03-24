package com.example.android.designpatterns.structural.flyweight;

/**
 * Created by rynel on 3/24/2018.
 */

public class FlyweightDemo {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        for (int i = 0; i < 5; i++) {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            flyweightAdder.doStuff(i, i);

            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
            flyweightMultiplier.doStuff(i, i);
        }
    }

}
