package com.example.android.designpatterns.behavioral.command;

/**
 * Created by rynel on 3/25/2018.
 */

public class CartridgeSwitchCommand implements Command {

    Cartridge cartridge;

    public CartridgeSwitchCommand(Cartridge cartridge){
        this.cartridge = cartridge;
    }

    @Override
    public void execute() {
        cartridge.insertCartridge();
    }
}
