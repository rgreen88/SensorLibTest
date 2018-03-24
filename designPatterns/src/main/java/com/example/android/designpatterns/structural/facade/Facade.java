package com.example.android.designpatterns.structural.facade;

/**
 * Created by rynel on 3/24/2018.
 */

public class Facade {

    public void flipTable(){
        Facade1 facade1 = new Facade1();
        facade1.flipTable();
    }

    public void doDivision(){
        Facade2 facade2 = new Facade2();
        facade2.doDivisionJustBecause();
    }

    public void mumboJumbo(){
        Facade3 facade3 = new Facade3();
        facade3.doWordyThings();
    }
}
