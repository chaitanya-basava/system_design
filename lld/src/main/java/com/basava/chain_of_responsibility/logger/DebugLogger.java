package com.basava.chain_of_responsibility.logger;

public class DebugLogger extends AbstractLogger {
    @Override
    public void write(int level, String message) {
        if (level == DEBUG) System.out.println("Debug: " + message);
        else super.logMessage(level, message);
    }
}
