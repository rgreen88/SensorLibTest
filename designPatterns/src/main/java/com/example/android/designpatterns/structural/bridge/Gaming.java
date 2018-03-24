package com.example.android.designpatterns.structural.bridge;

/**
 * Created by rynel on 3/24/2018.
 */

public class Gaming extends Motherboard {

    public Gaming(Gaming gaming) {
        this.speedInMhz = 2133;
        this.gaming = gaming;
    }

    @Override
    public void run() {
        System.out.println("\nThe system is running well for gaming.");
        int speedInMhz = 2133;
        reportOnSpeed();
    }
}
