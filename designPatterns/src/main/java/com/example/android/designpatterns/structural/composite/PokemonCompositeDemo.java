package com.example.android.designpatterns.structural.composite;

/**
 * Created by rynel on 3/24/2018.
 */

public class PokemonCompositeDemo {

    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon("Electric", "Ghost");

        PokemonComposite pokemonComposite = new PokemonComposite();
        pokemonComposite.add(pokemon);

        System.out.println("Pokemon is of the following type(s):");

        pokemon.Type1();
        pokemon.Type2();
    }
}
