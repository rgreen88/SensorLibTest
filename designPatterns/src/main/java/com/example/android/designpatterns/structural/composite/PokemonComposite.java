package com.example.android.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rynel on 3/24/2018.
 */

public class PokemonComposite implements PokemonTypeComponent {

    private List<PokemonTypeComponent> components = new ArrayList<>();

    @Override
    public void Type1() {

        for (PokemonTypeComponent component : components) {
            component.Type1();
        }

    }

    @Override
    public void Type2() {

        for (PokemonTypeComponent component : components) {
            component.Type2();
        }

    }

    public void add(PokemonTypeComponent component) {
        components.add(component);
    }

    public void remove(PokemonTypeComponent component) {
        components.remove(component);
    }

    public List<PokemonTypeComponent> getComponents() {
        return components;
    }

    public PokemonTypeComponent getComponent(int index) {
        return components.get(index);
    }
}
