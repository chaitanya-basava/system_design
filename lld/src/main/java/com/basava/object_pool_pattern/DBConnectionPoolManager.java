package com.basava.object_pool_pattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private static final int MAX_POOL_SIZE = 5;
    private static final int INITIAL_POOL_SIZE = 3;
    private static volatile DBConnectionPoolManager instance = null;

    private final List<DBConnection> freeList = new ArrayList<>();
    private final List<DBConnection> inUseList = new ArrayList<>();

    private DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeList.add(new DBConnection());
        }
    }

    // manager needs to be singleton
    public static DBConnectionPoolManager getInstance() {
        if(instance == null) {
            // locking on class, as instance is a class level variable
            synchronized(DBConnectionPoolManager.class) {
                if(instance == null) {
                    instance = new DBConnectionPoolManager();
                }
            }
        }
        return instance;
    }

    public synchronized DBConnection getResource() {
        if(freeList.isEmpty() && inUseList.size() < MAX_POOL_SIZE) {
            freeList.add(new DBConnection());
        } else if(freeList.isEmpty() && inUseList.size() >= MAX_POOL_SIZE) {
            return null;
        }

        DBConnection connection = freeList.remove(freeList.size() - 1);
        inUseList.add(connection);
        return connection;
    }

    public synchronized void releaseResource(DBConnection connection) {
        if(connection != null) {
            inUseList.remove(connection);
            freeList.add(connection);
        }
    }
}
