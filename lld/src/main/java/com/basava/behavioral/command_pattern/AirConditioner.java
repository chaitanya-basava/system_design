package com.basava.behavioral.command_pattern;


// Receiver
public class AirConditioner {
    private boolean isOn = false;

    public void turnOn() {
        this.isOn = true;
        System.out.println("Air Conditioner is on");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Air Conditioner is off");
    }

    public void increaseTemp() {
        System.out.println("Temperature increased");
    }

    public boolean isOn() {
        return isOn;
    }
}
