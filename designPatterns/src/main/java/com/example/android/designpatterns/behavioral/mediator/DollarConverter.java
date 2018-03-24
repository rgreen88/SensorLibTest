package com.example.android.designpatterns.behavioral.mediator;

/**
 * Created by rynel on 3/24/2018.
 */

public class DollarConverter {

    private Mediator mediator;

    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT = 0.7f;

    public DollarConverter(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerDollarConverter(this);
    }

    private float convertEurosToDollars(float euros) {
        float dollars = euros * (DOLLAR_UNIT / EURO_UNIT);
        System.out.println("Converting " + euros + " euros to " + dollars + " dollars");
        return dollars;
    }

    public float convertCurrencyToDollars(float amount) {

            return convertEurosToDollars(amount);

    }


}
