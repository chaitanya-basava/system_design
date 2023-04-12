package com.basava.strategy_pattern.with;

import com.basava.strategy_pattern.with.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
