package com.basava.chain_of_responsibility.logger;

public class InfoLogger extends AbstractLogger {
    @Override
    public void write(int level, String message) {
        if (level == INFO) {
            System.out.println("Info: " + message);
        } else {
            super.logMessage(level, message);
        }
    }
}
