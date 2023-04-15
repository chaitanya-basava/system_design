package com.basava.abstract_factory_pattern.cars;

public class BMW implements Car {
    @Override
    public double avgSpeed() {
        return 80.0;
    }

    @Override
    public String getName() {
        return "BMW";
    }
}
