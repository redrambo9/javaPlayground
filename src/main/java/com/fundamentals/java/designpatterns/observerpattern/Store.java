package com.fundamentals.java.designpatterns.observerpattern;

import com.fundamentals.java.designpatterns.observerpattern.observable.AndroidObservableImpl;
import com.fundamentals.java.designpatterns.observerpattern.observable.IphoneObservableImpl;
import com.fundamentals.java.designpatterns.observerpattern.observable.StockObservable;
import com.fundamentals.java.designpatterns.observerpattern.observer.EmailAlertObserverImpl;
import com.fundamentals.java.designpatterns.observerpattern.observer.MobileAlertObserverImpl;
import com.fundamentals.java.designpatterns.observerpattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String args[]){
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("user_name",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);
        iphoneStockObservable.setStockCount(20);

        StockObservable androidObservable = new AndroidObservableImpl();

        androidObservable.add(observer1);
        androidObservable.setStockCount(30);
    }
}
