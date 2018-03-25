package com.example.android.designpatterns.behavioral.state;

/**
 * Created by rynel on 3/25/2018.
 */

public class AngryState implements EmotionalState {
    @Override
    public String sayHello() {
        return "(ﾉಥ益ಥ）ﾉ┻━┻"; //flip table greeting mad
    }

    @Override
    public String sayGoodbye() {
        return "(╯°Д°）╯︵ /(.□ . )"; //flipping dude over while saying bye
    }
}
