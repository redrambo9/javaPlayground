package com.fundamentals.java.designpatterns.observerpattern.observable;

import com.fundamentals.java.designpatterns.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidObservableImpl implements StockObservable {
    int currentStockCount;
    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver itemInList : notificationAlertObserverList) {
            itemInList.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (currentStockCount == 0) {
            notifySubscribers();
        }
        currentStockCount += newStockCount;

    }

    @Override
    public int getStockCount() {
        return currentStockCount;
    }
}
