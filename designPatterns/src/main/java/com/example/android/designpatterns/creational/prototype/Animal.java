package com.example.android.designpatterns.creational.prototype;

/**
 * Created by rynel on 3/24/2018.
 */

public class Animal implements Prototype {

    String animal;

    public Animal (String animal){
        this.animal = animal;
    }

    @Override
    public Prototype doClone() {
        return new Animal(animal);
    }

    public String toString(){
        return "This animal is a(n)" + animal;
    }
}
