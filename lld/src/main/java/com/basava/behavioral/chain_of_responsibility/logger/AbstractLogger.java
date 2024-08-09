package com.basava.behavioral.chain_of_responsibility.logger;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    private AbstractLogger nextLogger;

    // 2nd type of setting next handler
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    protected void logMessage(int level, String message) {
        if(nextLogger != null) nextLogger.write(level, message);
    }

    public abstract void write(int level, String message);
}
