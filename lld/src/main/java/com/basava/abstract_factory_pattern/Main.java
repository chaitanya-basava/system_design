package com.basava.abstract_factory_pattern;

import com.basava.abstract_factory_pattern.cars.Car;
import com.basava.abstract_factory_pattern.car_factories.CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory luxuryFactory = CarFactory.getCarFactory("Luxury");
        CarFactory ordinaryFactory = CarFactory.getCarFactory("Ordinary");

        assert luxuryFactory != null;
        Car car1 = luxuryFactory.getCar("BMW");

        assert ordinaryFactory != null;
        Car car2 = ordinaryFactory.getCar("Brezza");

        System.out.println(car1.getName() + " has an average speed of " + car1.avgSpeed());
        System.out.println(car2.getName() + " has an average speed of " + car2.avgSpeed());
    }
}
