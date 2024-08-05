package com.basava.behavioral.strategy_pattern.without;


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new PublicVehicle();
        Vehicle specialVehicle = new OffroadVehicle();

        vehicle.drive();
        specialVehicle.drive();
    }
}
