package com.basava.behavioral.mediator_pattern;

import com.basava.behavioral.mediator_pattern.colleague.Bidder;
import com.basava.behavioral.mediator_pattern.mediator.AuctionMediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediator();
        Bidder bidder1 = new Bidder("Bidder 1", auctionMediator);
        Bidder bidder2 = new Bidder("Bidder 2", auctionMediator);
        Bidder bidder3 = new Bidder("Bidder 3", auctionMediator);

        bidder1.placeBid(100);
        System.out.println("----------------------");
        bidder2.placeBid(200);
        System.out.println("----------------------");
        bidder3.placeBid(300);
        System.out.println("----------------------");
        bidder1.placeBid(400);
    }
}
