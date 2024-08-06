package com.basava.behavioral.command_pattern.command;

import com.basava.behavioral.command_pattern.AirConditioner;

public class TurnAcOn implements Command {
    private final AirConditioner airConditioner;

    public TurnAcOn(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }

    @Override
    public void undo() {
        airConditioner.turnOff();
    }
}
