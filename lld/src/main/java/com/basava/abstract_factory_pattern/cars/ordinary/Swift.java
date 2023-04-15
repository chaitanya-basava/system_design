package com.basava.abstract_factory_pattern.cars.ordinary;

public class Swift implements OrdinaryCar {

    @Override
    public double avgSpeed() {
        return 60.0;
    }

    @Override
    public String getName() {
        return "Swift";
    }
}
