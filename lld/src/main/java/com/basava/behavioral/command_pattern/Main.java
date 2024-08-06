package com.basava.behavioral.command_pattern;

import com.basava.behavioral.command_pattern.command.IncreaseAcTemp;
import com.basava.behavioral.command_pattern.command.TurnAcOff;
import com.basava.behavioral.command_pattern.command.TurnAcOn;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(new TurnAcOn(airConditioner));
        remoteController.pressButton();

        remoteController.setCommand(new TurnAcOff(airConditioner));
        remoteController.pressButton();

        remoteController.pressUndoButton();

        remoteController.setCommand(new IncreaseAcTemp(airConditioner));
        remoteController.pressButton();

        remoteController.setCommand(new TurnAcOff(airConditioner));
        remoteController.pressButton();

        remoteController.setCommand(new IncreaseAcTemp(airConditioner));
        remoteController.pressButton();
    }
}
