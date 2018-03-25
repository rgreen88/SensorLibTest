package com.example.android.designpatterns.behavioral.chain;

/**
 * Created by rynel on 3/25/2018.
 */

public class ChainDemo {

    public static void main(String[] args) {

        ConsoleHandler chain = setChain();

        chain.handleRequest(ConsoleEnum.NINTENDO);
        chain.handleRequest(ConsoleEnum.PLAYSTATION);
        chain.handleRequest(ConsoleEnum.XBOX);

    }


    public static ConsoleHandler setChain() {

        ConsoleHandler nintendo = new NintendoHandler();

        ConsoleHandler playstation = new PlaystationHandler();

        ConsoleHandler xbox = new XboxHandler();

        nintendo.setConsoleFranchise(xbox);
        nintendo.setConsoleFranchise(nintendo);
        xbox.setConsoleFranchise(xbox);
        playstation.setConsoleFranchise(playstation);
        xbox.setConsoleFranchise(playstation);

        return nintendo; //starts running nintendo through the list
    }

}
