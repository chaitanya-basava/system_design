package com.basava.creational.abstract_factory_pattern.car_factories;

import com.basava.creational.abstract_factory_pattern.cars.luxury.LuxuryCar;
import com.basava.creational.abstract_factory_pattern.cars.ordinary.Brezza;
import com.basava.creational.abstract_factory_pattern.cars.ordinary.OrdinaryCar;
import com.basava.creational.abstract_factory_pattern.cars.ordinary.Swift;

public class OrdinaryCarFactory implements CarFactory {
    @Override
    public OrdinaryCar getOrdinaryCar(String carType) {
        return switch (carType) {
            case "Brezza" -> new Brezza();
            case "Swift" -> new Swift();
            default -> throw new IllegalStateException("Unexpected value: " + carType);
        };
    }

    @Override
    public LuxuryCar getLuxuryCar(String carType) {
        return null;
    }
}
