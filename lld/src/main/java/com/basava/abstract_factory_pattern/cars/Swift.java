package com.basava.abstract_factory_pattern.cars;

public class Swift implements Car{

    @Override
    public double avgSpeed() {
        return 60.0;
    }

    @Override
    public String getName() {
        return "Swift";
    }
}
