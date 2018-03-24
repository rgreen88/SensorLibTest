package com.example.android.designpatterns.behavioral.mediator;

/**
 * Created by rynel on 3/24/2018.
 */

public class Demo {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Buyer frenchBuyer = new FrenchBuyer(mediator);
        float sellingPriceInDollars = 10.0f;
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);

        float frenchBidInEuros = 3.0f;
        while (!frenchBuyer.attemptToPurchase(frenchBidInEuros)) {
            frenchBidInEuros += 1.5f;
        }
    }
}
