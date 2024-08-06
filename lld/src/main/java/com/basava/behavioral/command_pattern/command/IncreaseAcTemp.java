package com.basava.behavioral.command_pattern.command;

import com.basava.behavioral.command_pattern.AirConditioner;

public class IncreaseAcTemp implements Command {
    private final AirConditioner airConditioner;

    public IncreaseAcTemp(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        // now the client doesn't need to know that it needs to check if ac is on or not
        // command will do the necessary checks and method calls
        // client just needs to invoke the command
        if(airConditioner.isOn())
            airConditioner.increaseTemp();
        else {
            System.out.println("Please turn on the AC first");
        }
    }

    @Override
    public void undo() {
        // add decreaseTemp method in AirConditioner class and call it
    }
}
