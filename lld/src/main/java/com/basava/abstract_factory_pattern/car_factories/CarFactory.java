package com.basava.abstract_factory_pattern.car_factories;

import com.basava.abstract_factory_pattern.cars.Car;

public interface CarFactory {
    Car getCar(String carType);

    static CarFactory getCarFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("Luxury")) {
            return new LuxuryCarFactory();
        } else if (factoryType.equalsIgnoreCase("Ordinary")) {
            return new OrdinaryCarFactory();
        }
        return null;
    }
}
