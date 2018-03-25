package com.example.android.designpatterns.behavioral.state;

/**
 * Created by rynel on 3/25/2018.
 */

public class EmotionalDemo {


    public static void main(String[] args) {

        Person person = new Person(new HappyState());
        System.out.println("Hello in happy state: " + person.sayHello());
        System.out.println("Goodbye in happy state: " + person.sayGoodbye());

        person.setEmotionalState(new AngryState());
        System.out.println("Hello in angry state: " + person.sayHello());
        System.out.println("Goodbye in angry state: " + person.sayGoodbye());

    }
}
