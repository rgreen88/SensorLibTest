package com.example.android.designpatterns.behavioral.state;

/**
 * Created by rynel on 3/25/2018.
 */

public class Person implements EmotionalState {

    EmotionalState emotionalState;

    public Person(EmotionalState emotionalState) {
        this.emotionalState = emotionalState;
    }

    public void setEmotionalState(EmotionalState emotionalState) {
        this.emotionalState = emotionalState;
    }

    @Override
    public String sayHello() {
        return emotionalState.sayHello();
    }

    @Override
    public String sayGoodbye() {
        return emotionalState.sayGoodbye();
    }
}
