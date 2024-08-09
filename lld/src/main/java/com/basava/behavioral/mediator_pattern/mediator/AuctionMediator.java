package com.basava.behavioral.mediator_pattern.mediator;

import com.basava.behavioral.mediator_pattern.colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void placeBid(int bidAmount, Colleague colleague) {
        for (Colleague c : colleagues) {
            if (!c.equals(colleague)) {
                c.receiveBid(bidAmount);
            }
        }
    }
}
