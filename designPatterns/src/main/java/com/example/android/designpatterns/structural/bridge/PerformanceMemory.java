package com.example.android.designpatterns.structural.bridge;

/**
 * Created by rynel on 3/24/2018.
 */

public class PerformanceMemory implements Motherboard {

    int speed;

    public PerformanceMemory(){
        speed = 1333;
    }
    @Override
    public int run() {
        System.out.println("The performance memory is purring");
        return speed;
    }
}
