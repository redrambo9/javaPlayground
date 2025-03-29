package com.fundamentals.java.designpatterns.templatemethodpattern;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Friend Request Validated");
    }

    @Override
    public void calculateFee() {
        System.out.println("Friend Fee Calculated");
    }

    @Override
    public void debitAmount() {
        System.out.println("Friend Amount Debited");
    }

    @Override
    public void creditAmount() {
        System.out.println("Friend Amount Credited");
    }
}
