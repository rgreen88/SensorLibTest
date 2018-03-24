package com.example.android.designpatterns.structural.Proxy;

/**
 * Created by rynel on 3/24/2018.
 */

public class ProxyDemo {

    public static void main(String[] args) {

        Proxy proxy = new Proxy();

        Party party = new Party();
        party.letsHaveFun();

        proxy.showFrustration();

    }
}
