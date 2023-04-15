package com.basava.abstract_factory_pattern.cars.luxury;

public class BMW implements LuxuryCar {
    @Override
    public double avgSpeed() {
        return 80.0;
    }

    @Override
    public String getName() {
        return "BMW";
    }

    @Override
    public String getLuxuryType() {
        return "Smooth seats";
    }
}
