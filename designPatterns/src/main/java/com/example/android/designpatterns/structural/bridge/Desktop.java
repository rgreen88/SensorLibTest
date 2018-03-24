package com.example.android.designpatterns.structural.bridge;

/**
 * Created by rynel on 3/24/2018.
 */

public class Desktop extends Computer {

    public Desktop (Motherboard motherboard){
        this.speedInMhz = 2433;
        this.motherboard = motherboard;
    }
    @Override
    public void run() {

        System.out.println("\nThe computer is a gamer");
        int speedInMhz = motherboard.run();
        reportOnSpeed(speedInMhz);

    }
}
