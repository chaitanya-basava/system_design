package com.basava.strategy_pattern.without;

public class OffroadVehicle extends Vehicle {
    @Override
    public void drive() {
        // duplicate code
        System.out.println("Special drive method");
    }
}
