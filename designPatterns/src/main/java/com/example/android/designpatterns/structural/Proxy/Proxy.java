package com.example.android.designpatterns.structural.Proxy;

import java.util.Date;

/**
 * Created by rynel on 3/24/2018.
 */

public class Proxy {


    PartyStartedLate partyStartedLate;

    public Proxy() {
        System.out.println("Creating proxy at " + new Date());
    }

    public void showFrustration() {
        if (partyStartedLate == null) {
            partyStartedLate = new PartyStartedLate();
        }
        partyStartedLate.letsHaveFun();
    }
}
