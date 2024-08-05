package com.basava.creational.abstract_factory_pattern;

import com.basava.creational.abstract_factory_pattern.car_factories.CarFactory;
import com.basava.creational.abstract_factory_pattern.cars.luxury.LuxuryCar;
import com.basava.creational.abstract_factory_pattern.cars.ordinary.OrdinaryCar;

public class Main {
    public static void main(String[] args) {
        CarFactory luxuryFactory = CarFactory.getCarFactory("Luxury");
        CarFactory ordinaryFactory = CarFactory.getCarFactory("Ordinary");

        assert luxuryFactory != null;
        LuxuryCar car1 = luxuryFactory.getLuxuryCar("BMW");

        assert ordinaryFactory != null;
        OrdinaryCar car2 = ordinaryFactory.getOrdinaryCar("Brezza");

        System.out.println(
                car1.getName()
                + " has an average speed of " + car1.avgSpeed()
                + " and has luxury components: " + car1.getLuxuryType()
        );
        System.out.println(
                car2.getName()
                + " has an average speed of " + car2.avgSpeed()
                + " and is ordinary"
        );
    }
}
