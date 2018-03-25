package com.example.android.designpatterns.behavioral.chain;

/**
 * Created by rynel on 3/25/2018.
 */

public abstract class ConsoleHandler {


    ConsoleHandler consoleFranchise;

    public void setConsoleFranchise(ConsoleHandler consoleFranchise) {
        this.consoleFranchise = consoleFranchise;
    }

    public abstract void handleRequest(ConsoleEnum request);

}
