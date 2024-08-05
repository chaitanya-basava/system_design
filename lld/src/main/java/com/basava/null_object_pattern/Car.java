package com.basava.null_object_pattern;

public class Car implements Vehicle {
    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public int getCapacity() {
        return 4;
    }
}
