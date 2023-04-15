package com.basava.abstract_factory_pattern.cars.ordinary;

public class Brezza implements OrdinaryCar {
    @Override
    public double avgSpeed() {
        return 65.0;
    }

    @Override
    public String getName() {
        return "Brezza";
    }
}
