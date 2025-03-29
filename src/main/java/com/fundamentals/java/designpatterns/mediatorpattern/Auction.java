package com.fundamentals.java.designpatterns.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleague> colleagues = new ArrayList<>();
    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague c : colleagues){
            if(c.getName().equals(bidder.getName())){
                c.receiveBidNotification(bidAmount);
            }
        }
    }
}
