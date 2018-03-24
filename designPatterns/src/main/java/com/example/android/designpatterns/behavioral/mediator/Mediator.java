package com.example.android.designpatterns.behavioral.mediator;

/**
 * Created by rynel on 3/24/2018.
 */

public class Mediator {

    private Buyer frenchBuyer;
    private AmericanSeller americanSeller;
    private DollarConverter dollarConverter;

    public Mediator() {
    }

    public void registerAmericanSeller(AmericanSeller americanSeller) {
        this.americanSeller = americanSeller;
    }

    public void registerFrenchBuyer(FrenchBuyer frenchBuyer) {
        this.frenchBuyer = frenchBuyer;
    }


    public void registerDollarConverter(DollarConverter dollarConverter) {
        this.dollarConverter = dollarConverter;
    }

    public boolean placeBid(float bid, String unitOfCurrency) {
        float dollarAmount = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency);
        return americanSeller.isBidAccepted(dollarAmount);
    }

}
