package com.fundamentals.java.designpatterns.observerpattern.observable;

import com.fundamentals.java.designpatterns.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscribers();

    public void setStockCount(int newStockCount);

    public int getStockCount();

}
