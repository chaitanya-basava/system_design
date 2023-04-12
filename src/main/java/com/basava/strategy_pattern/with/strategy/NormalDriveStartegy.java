package com.basava.strategy_pattern.with.strategy;

public class NormalDriveStartegy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive method");
    }
}
