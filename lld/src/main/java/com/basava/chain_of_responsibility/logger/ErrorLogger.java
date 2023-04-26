package com.basava.chain_of_responsibility.logger;

public class ErrorLogger extends AbstractLogger {
    @Override
    public void write(int level, String message) {
        if (level == ERROR) System.out.println("Error: " + message);
        else super.logMessage(level, message);
    }
}
