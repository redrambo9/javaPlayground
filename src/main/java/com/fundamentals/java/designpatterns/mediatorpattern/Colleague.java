package com.fundamentals.java.designpatterns.mediatorpattern;

public interface Colleague {
    void placeBid(int bidAmount);

    void receiveBidNotification(int bidAmount);

    String getName();
}
