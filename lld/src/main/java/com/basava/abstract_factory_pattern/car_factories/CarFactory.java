package com.basava.abstract_factory_pattern.car_factories;

import com.basava.abstract_factory_pattern.cars.luxury.LuxuryCar;
import com.basava.abstract_factory_pattern.cars.ordinary.OrdinaryCar;

public interface CarFactory {
    OrdinaryCar getOrdinaryCar(String carType);
    LuxuryCar getLuxuryCar(String carType);

    // this method can be in a separate class like CarFactoryCreator
    static CarFactory getCarFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("Luxury")) {
            return new LuxuryCarFactory();
        } else if (factoryType.equalsIgnoreCase("Ordinary")) {
            return new OrdinaryCarFactory();
        }
        return null;
    }
}
