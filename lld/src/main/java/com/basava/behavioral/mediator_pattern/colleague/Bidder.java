package com.basava.behavioral.mediator_pattern.colleague;

import com.basava.behavioral.mediator_pattern.mediator.Mediator;

public class Bidder implements Colleague {
    private final String name;
    private final Mediator auctionMediator;

    public Bidder(String name, Mediator mediator) {
        this.name = name;
        this.auctionMediator = mediator;
        this.auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(bidAmount, this);
    }

    @Override
    public void receiveBid(int bidAmount) {
        System.out.println(name + " has been notified that someone has placed a bid og amount: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
