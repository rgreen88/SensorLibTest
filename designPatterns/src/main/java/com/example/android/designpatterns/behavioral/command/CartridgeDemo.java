package com.example.android.designpatterns.behavioral.command;

/**
 * Created by rynel on 3/25/2018.
 */

public class CartridgeDemo {

    public static void main(String[] args) {

        Cartridge cartridge = new Cartridge(); //receiver
        Command cartridgeCommand = new CartridgeSwitchCommand(cartridge);//concrete command

        CartridgeInvoker cartridgeInvoker = new CartridgeInvoker(cartridgeCommand); //invoker
        cartridgeInvoker.invoke();

        cartridgeInvoker.setCommand(cartridgeCommand); //removing cartridge
        cartridgeInvoker.devoke();



    }

}
