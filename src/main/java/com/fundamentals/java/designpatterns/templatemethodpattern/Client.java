package com.fundamentals.java.designpatterns.templatemethodpattern;

public class Client {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();

        paymentFlow.sendMoney();

        PaymentFlow paymentFlow2 = new PayToMerchant();

        paymentFlow2.sendMoney();
    }
}
