package com.example.android.designpatterns.behavioral.chain;

/**
 * Created by rynel on 3/25/2018.
 */

public class XboxHandler extends ConsoleHandler {

    @Override
    public void handleRequest(ConsoleEnum request) {

        if (request == ConsoleEnum.XBOX) {
            System.out.println("XboxHandler handles " + request);
            System.out.println("Xbox is full of Call of Duty lovers.\n");
        } else {
            System.out.println("XboxHandler doesn't handle " + request);
            if (consoleFranchise != null) {
                consoleFranchise.handleRequest(request);
            }
        }

    }

}
