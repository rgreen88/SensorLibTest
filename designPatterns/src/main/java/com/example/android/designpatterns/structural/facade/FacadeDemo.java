package com.example.android.designpatterns.structural.facade;

/**
 * Created by rynel on 3/24/2018.
 */

public class FacadeDemo {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.flipTable(); //Facade1
        facade.doDivision(); //Facade2
        facade.mumboJumbo(); //Facade3
    }
}
