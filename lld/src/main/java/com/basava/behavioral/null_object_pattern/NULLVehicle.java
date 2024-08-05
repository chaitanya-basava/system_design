package com.basava.behavioral.null_object_pattern;

public class NULLVehicle implements Vehicle {
    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
