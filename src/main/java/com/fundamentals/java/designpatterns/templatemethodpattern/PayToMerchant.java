package com.fundamentals.java.designpatterns.templatemethodpattern;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Merchant Request Validated");
    }

    @Override
    public void calculateFee() {
        System.out.println("Merchant Fee Calculated");
    }

    @Override
    public void debitAmount() {
        System.out.println("Merchant Amount Debited");
    }

    @Override
    public void creditAmount() {
        System.out.println("Merchant Amount Credited");
    }
}
