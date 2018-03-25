package com.example.android.designpatterns.behavioral.strategy;

/**
 * Created by rynel on 3/25/2018.
 */

public class GraphicCardStrategy implements Strategy {

    @Override
    public boolean checkTemp(int tempF) {
        return (tempF >= 90) && (tempF <= 220);
    }
}
