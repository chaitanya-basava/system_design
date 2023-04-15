package com.basava.abstract_factory_pattern.car_factories;

import com.basava.abstract_factory_pattern.cars.Car;
import com.basava.abstract_factory_pattern.cars.BMW;
import com.basava.abstract_factory_pattern.cars.Benz;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public Car getCar(String carType) {
        return switch (carType) {
            case "BMW" -> new BMW();
            case "Benz" -> new Benz();
            default -> throw new IllegalStateException("Unexpected value: " + carType);
        };
    }
}
