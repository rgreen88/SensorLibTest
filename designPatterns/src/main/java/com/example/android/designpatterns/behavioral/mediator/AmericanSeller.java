package com.example.android.designpatterns.behavioral.mediator;

/**
 * Created by rynel on 3/24/2018.
 */

public class AmericanSeller {

    Mediator mediator;
    float priceInDollars;

    public AmericanSeller(Mediator mediator, float priceInDollars) {
        this.mediator = mediator;
        this.priceInDollars = priceInDollars;
        this.mediator.registerAmericanSeller(this);
    }

    public boolean isBidAccepted(float bidInDollars) {
        if (bidInDollars >= priceInDollars) {
            System.out.println("Seller accepts the bid of " + bidInDollars + " dollars\n");
            return true;
        } else {
            System.out.println("Seller rejects the bid of " + bidInDollars + " dollars\n");
            return false;
        }
    }
}
