package com.example.android.designpatterns.behavioral.strategy;

/**
 * Created by rynel on 3/25/2018.
 */

public class Context {

    int temperatureInF;
    Strategy strategy;

    public Context(int temperatureInF, Strategy strategy) {
        this.temperatureInF = temperatureInF;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getTemperatureInF() {
        return temperatureInF;
    }

    public boolean getResult() {
        return strategy.checkTemp(temperatureInF);
    }

}
