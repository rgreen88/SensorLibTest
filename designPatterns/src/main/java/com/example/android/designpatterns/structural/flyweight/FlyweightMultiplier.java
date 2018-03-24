package com.example.android.designpatterns.structural.flyweight;

/**
 * Created by rynel on 3/24/2018.
 */

public class FlyweightMultiplier implements Flyweight{

    String stuffThatIsComplicated;

    public FlyweightMultiplier() {

        stuffThatIsComplicated = "Math Stuff (multiply)";

        //limiting number of flyweight objects created by expending time by 5 seconds to create
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doStuff(int a, int b) {

        int c = a * b;
        System.out.println("a * b = " + c);

    }
}
