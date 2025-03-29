package com.fundamentals.java.designpatterns.observerpattern.observer;

import com.fundamentals.java.designpatterns.observerpattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailID;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailID, StockObservable stockObservable) {
        this.emailID = emailID;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(emailID, "Product is in Stock Now");
    }

    private void sendMail(String emailID, String message) {
        System.out.println("Mail sent to " + emailID);
    }
}
