package com.basava.singleton_pattern;

public class DBConnection {

    private static DBConnection instance = null;

    private DBConnection() {
        // private constructor
    }

    public static DBConnection getInstance() {
        if(instance == null) {
            // locking on class, as instance is a class level variable
            synchronized(DBConnection.class) {
                if(instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
