package com.basava.behavioral.command_pattern;

import com.basava.behavioral.command_pattern.command.Command;

import java.util.Stack;


// RemoteController is the invoker
public class RemoteController {
    private Command command;
    private final Stack<Command> commandHistory = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        this.commandHistory.push(command);
    }

    public void pressUndoButton() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }
}
