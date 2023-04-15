package com.basava.abstract_factory_pattern.cars;

public class Brezza implements Car{
    @Override
    public double avgSpeed() {
        return 65.0;
    }

    @Override
    public String getName() {
        return "Brezza";
    }
}
