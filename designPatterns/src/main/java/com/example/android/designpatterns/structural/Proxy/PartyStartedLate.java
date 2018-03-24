package com.example.android.designpatterns.structural.Proxy;

/**
 * Created by rynel on 3/24/2018.
 */

public class PartyStartedLate extends Fun{

    public PartyStartedLate(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Late people make me angry! (ﾉಥ益ಥ）ﾉ ┻━┻");

    }
}
