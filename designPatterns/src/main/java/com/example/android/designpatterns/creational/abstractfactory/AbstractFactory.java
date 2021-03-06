package com.example.android.designpatterns.creational.abstractfactory;

import com.example.android.designpatterns.creational.factory.Factory;
import com.example.android.designpatterns.creational.factory.FactoryProduction;

/**
 * Created by rynel on 3/24/2018.
 */

public class AbstractFactory {


    public Factory getSpeciesFactory(String type) {
        if ("stuff".equals(type)) {
            return new FactoryProduction();
        } else {
            return null; //can return another factory if existing otherwise
        }
    }

}
