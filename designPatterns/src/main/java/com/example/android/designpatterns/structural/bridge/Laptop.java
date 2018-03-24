package com.example.android.designpatterns.structural.bridge;

/**
 * Created by rynel on 3/24/2018.
 */

public class Laptop extends Computer {

    public Laptop(Motherboard motherboard){
        this.speedInMhz = 1333;
        this.motherboard = motherboard;
    }
    @Override
    public void run() {

        System.out.println("\nThe computer is a entertainer");
        int speedInMhz = motherboard.run();
        reportOnSpeed(speedInMhz);


    }
}
