package com.basava.behavioral.strategy_pattern.with.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive method");
    }
}
