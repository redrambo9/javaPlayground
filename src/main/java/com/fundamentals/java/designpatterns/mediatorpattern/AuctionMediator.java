package com.fundamentals.java.designpatterns.mediatorpattern;

public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);
}
