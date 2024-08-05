package com.basava.behavioral.strategy_pattern.with.strategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special drive method");
    }
}
