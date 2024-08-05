package com.basava.behavioral.null_object_pattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        }

        return new NULLVehicle();
    }
}
