package com.basava.strategy_pattern.with;

import com.basava.strategy_pattern.with.strategy.NormalDriveStrategy;

public class PublicVehicle extends Vehicle {
    PublicVehicle() {
        super(new NormalDriveStrategy());
    }
}
