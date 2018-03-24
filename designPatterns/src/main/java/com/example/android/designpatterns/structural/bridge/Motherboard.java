package com.example.android.designpatterns.structural.bridge;

/**
 * Created by rynel on 3/24/2018.
 */

public abstract class Motherboard {

    Gaming gaming;
    int speedInMhz;

    public abstract void run();

    public void setGaming(Gaming gaming) {
        this.gaming = gaming;
    }

    public void reportOnSpeed() {
        int memoryStick = speedInMhz;
        if (memoryStick < 1299) {
            System.out.println("The gaming is for budget.");
        } else if ((memoryStick >= 1300) && (memoryStick < 1800)) {
            System.out.println("The vehicle is for entertainment.");
        } else {
            System.out.println("The gaming is for gaming.");
        }
    }

}
