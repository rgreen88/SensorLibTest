package com.example.android.designpatterns.behavioral.chain;

/**
 * Created by rynel on 3/25/2018.
 */

public class PlaystationHandler extends ConsoleHandler {

    @Override
    public void handleRequest(ConsoleEnum request) {

        if (request == ConsoleEnum.PLAYSTATION) {
            System.out.println("PlaystationHandler handles " + request);
            System.out.println("Playstation is full of fanboys.\n");
        } else {
            System.out.println("PlaystationHandler doesn't handle " + request);
            if (consoleFranchise != null) {
                consoleFranchise.handleRequest(request);
            }
        }

    }

}
