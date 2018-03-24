package com.example.android.designpatterns.structural.composite;

/**
 * Created by rynel on 3/24/2018.
 */

public class Pokemon implements PokemonTypeComponent{

    String type1, type2;

    public Pokemon(String type1, String type2){
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public void Type1() {

        System.out.println("Type 1: " + type1);

    }

    @Override
    public void Type2() {

        System.out.println("Type 2: " + type2);

    }
}
