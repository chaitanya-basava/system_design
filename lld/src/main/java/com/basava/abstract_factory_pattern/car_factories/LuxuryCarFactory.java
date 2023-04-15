package com.basava.abstract_factory_pattern.car_factories;

import com.basava.abstract_factory_pattern.cars.luxury.BMW;
import com.basava.abstract_factory_pattern.cars.luxury.Benz;
import com.basava.abstract_factory_pattern.cars.luxury.LuxuryCar;
import com.basava.abstract_factory_pattern.cars.ordinary.OrdinaryCar;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public OrdinaryCar getOrdinaryCar(String carType) {
        return null;
    }

    @Override
    public LuxuryCar getLuxuryCar(String carType) {
        return switch (carType) {
            case "BMW" -> new BMW();
            case "Benz" -> new Benz();
            default -> throw new IllegalStateException("Unexpected value: " + carType);
        };
    }
}
