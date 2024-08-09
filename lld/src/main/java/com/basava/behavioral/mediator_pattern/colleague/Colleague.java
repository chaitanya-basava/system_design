package com.basava.behavioral.mediator_pattern.colleague;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveBid(int bidAmount);
    String getName();
}
