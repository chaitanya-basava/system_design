package com.basava.strategy_pattern.with;

import com.basava.strategy_pattern.with.strategy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveObj;

    Vehicle(DriveStrategy obj) {
        this.driveObj = obj;
    }

    public void drive() {
        this.driveObj.drive();
    }
}
