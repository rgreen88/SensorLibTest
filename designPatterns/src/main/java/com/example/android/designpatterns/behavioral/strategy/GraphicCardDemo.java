package com.example.android.designpatterns.behavioral.strategy;

/**
 * Created by rynel on 3/25/2018.
 */

public class GraphicCardDemo {

    public static void main(String[] args) {

        int temperatureInF = 200;

        Strategy graphicCardStrategy = new GraphicCardStrategy();
        Context context = new Context(temperatureInF, graphicCardStrategy);

        System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for the graphic card? " + context.getResult());
    }
}
