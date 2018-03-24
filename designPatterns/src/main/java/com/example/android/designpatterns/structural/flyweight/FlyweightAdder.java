package com.example.android.designpatterns.structural.flyweight;

/**
 * Created by rynel on 3/24/2018.
 */

public class FlyweightAdder implements  Flyweight {

    String stuffThatIsEasy;

    public FlyweightAdder() {

        stuffThatIsEasy = "Math Stuff (adding kid style)";

        //limiting number of flyweight objects created by expending time by 5 seconds to create
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doStuff(int a, int b) {

        int c = a + b;
        System.out.println("a + b = " + c);
    }
}
