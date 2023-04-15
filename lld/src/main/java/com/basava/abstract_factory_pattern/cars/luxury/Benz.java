package com.basava.abstract_factory_pattern.cars.luxury;

public class Benz implements LuxuryCar {
    @Override
    public double avgSpeed() {
        return 90.0;
    }

    @Override
    public String getName() {
        return "Benz";
    }
}
