package com.example.android.designpatterns.behavioral.command;

/**
 * Created by rynel on 3/25/2018.
 */

public class CartridgeInvoker {

    Command command;

    public CartridgeInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }

    public void devoke() {
        command.remove();
    }

}
