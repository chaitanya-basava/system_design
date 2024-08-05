package com.basava.behavioral.strategy_pattern.with;

import com.basava.behavioral.strategy_pattern.with.strategy.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle {
    OffroadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
