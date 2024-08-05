package com.basava.behavioral.null_object_pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        printVehicle(car);

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        printVehicle(bike);
    }

    static void printVehicle(Vehicle vehicle) {
        // null check is not required, but if vehicle factory returns null
        // then we would have had to handle it here

        System.out.println("Seat capacity: " + vehicle.getCapacity());
        System.out.println("Speed: " + vehicle.getSpeed());
    }
}
