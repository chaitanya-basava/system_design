package com.basava.behavioral.mediator_pattern.mediator;

import com.basava.behavioral.mediator_pattern.colleague.Colleague;

public interface Mediator {
    void placeBid(int bidAmount, Colleague colleague);
    void addBidder(Colleague colleague);
}
