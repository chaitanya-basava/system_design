package com.basava.behavioral.command_pattern.command;

import com.basava.behavioral.command_pattern.AirConditioner;

public class TurnAcOff implements Command {
    private final AirConditioner airConditioner;

    public TurnAcOff(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }

    @Override
    public void undo() {
        airConditioner.turnOn();
    }
}
