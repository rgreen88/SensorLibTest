package com.example.android.designpatterns.behavioral.chain;

/**
 * Created by rynel on 3/25/2018.
 */

public class NintendoHandler extends ConsoleHandler {

    @Override
    public void handleRequest(ConsoleEnum request) {

        if (request == ConsoleEnum.NINTENDO) {
            System.out.println("NintendoHandler handles " + request);
            System.out.println("Nintendo is fun.\n");
        } else {
            System.out.println("NintendoHandler doesn't handle " + request);
            if (consoleFranchise != null) {
                consoleFranchise.handleRequest(request);
            }
        }

    }
}
