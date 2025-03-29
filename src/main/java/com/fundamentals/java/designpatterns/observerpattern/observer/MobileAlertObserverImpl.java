package com.fundamentals.java.designpatterns.observerpattern.observer;

import com.fundamentals.java.designpatterns.observerpattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Product is in Stock now");
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println("Message sent to" + userName);
    }
}
