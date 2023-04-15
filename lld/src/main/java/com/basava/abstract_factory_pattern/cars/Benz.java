package com.basava.abstract_factory_pattern.cars;

public class Benz implements Car{
    @Override
    public double avgSpeed() {
        return 90.0;
    }

    @Override
    public String getName() {
        return "Benz";
    }
}
