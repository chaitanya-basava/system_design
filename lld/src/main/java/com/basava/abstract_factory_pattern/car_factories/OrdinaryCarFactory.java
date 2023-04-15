package com.basava.abstract_factory_pattern.car_factories;

import com.basava.abstract_factory_pattern.cars.Car;
import com.basava.abstract_factory_pattern.cars.Swift;
import com.basava.abstract_factory_pattern.cars.Brezza;

public class OrdinaryCarFactory implements CarFactory {
    @Override
    public Car getCar(String carType) {
        return switch (carType) {
            case "Brezza" -> new Brezza();
            case "Swift" -> new Swift();
            default -> throw new IllegalStateException("Unexpected value: " + carType);
        };
    }
}
