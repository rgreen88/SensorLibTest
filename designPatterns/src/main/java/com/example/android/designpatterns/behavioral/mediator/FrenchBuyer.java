package com.example.android.designpatterns.behavioral.mediator;

/**
 * Created by rynel on 3/24/2018.
 */

public class FrenchBuyer extends Buyer{

    public FrenchBuyer(Mediator mediator) {
        super(mediator, "euro");
        this.mediator.registerFrenchBuyer(this);
    }

}
