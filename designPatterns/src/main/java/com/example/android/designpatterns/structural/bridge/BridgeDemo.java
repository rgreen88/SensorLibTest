package com.example.android.designpatterns.structural.bridge;

import sun.misc.Perf;

/**
 * Created by rynel on 3/24/2018.
 */

public class BridgeDemo {

    public static void main(String[] args) {

        Computer computer = new Desktop(new PerformanceMemory());
        computer.run();
        computer.setMotherboard(new BasicMemory());
        computer.run();

        computer = new Laptop(new BasicMemory());
        computer.run();
        computer.setMotherboard(new PerformanceMemory());
        computer.run();

    }

}
