package com.example.android.designpatterns.structural.bridge;

/**
 * Created by rynel on 3/24/2018.
 */

public class BasicMemory implements Motherboard {

    int speed;

    public BasicMemory(){
        speed = 1333;
    }
    @Override
    public int run() {
        System.out.println("The basic memory is running");
        return speed;
    }
}
