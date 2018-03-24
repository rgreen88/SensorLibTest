package com.example.android.designpatterns.structural.decorator;

/**
 * Created by rynel on 3/24/2018.
 */

public class RunningGame implements Game{


    @Override
    public void Decribe() {
        System.out.println("The game is running");
    }
}
