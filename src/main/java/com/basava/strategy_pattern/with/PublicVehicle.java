package com.basava.strategy_pattern.with;

import com.basava.strategy_pattern.with.strategy.NormalDriveStartegy;

public class PublicVehicle extends Vehicle {
    PublicVehicle() {
        super(new NormalDriveStartegy());
    }
}
