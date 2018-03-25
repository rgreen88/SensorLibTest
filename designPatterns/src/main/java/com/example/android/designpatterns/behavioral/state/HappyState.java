package com.example.android.designpatterns.behavioral.state;

/**
 * Created by rynel on 3/25/2018.
 */

public class HappyState implements EmotionalState {
    @Override
    public String sayHello() {
        return "Hey! :)";
    }

    @Override
    public String sayGoodbye() {
        return "Bye bye!! ^_^";
    }
}
