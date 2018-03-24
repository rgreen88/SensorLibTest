package com.example.android.designpatterns.structural.bridge;

/**
 * Created by rynel on 3/24/2018.
 */

public abstract class Computer {

    Motherboard motherboard;
    int speedInMhz;

    public abstract void run();

    public void setMotherboard(Motherboard motherboard){
        this.motherboard = motherboard;
    }

    public void reportOnSpeed(int speedInMhz) {
        if (speedInMhz < 1299) {
            System.out.println("The computer is a budget.");
        } else if ((speedInMhz >= 1300) && (speedInMhz < 1666)) {
            System.out.println("The computer is for entertainment.");
        } else {
            System.out.println("The computer in for gaming.");
        }

    }

}
