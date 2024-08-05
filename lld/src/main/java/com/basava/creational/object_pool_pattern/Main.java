package com.basava.creational.object_pool_pattern;

public class Main {
    public static void main(String[] args) {
        DBConnectionPoolManager poolManager = DBConnectionPoolManager.getInstance();
        DBConnection connection1 = poolManager.getResource();
        System.out.println(connection1);

        DBConnection connection2 = poolManager.getResource();
        System.out.println(connection2);

        DBConnection connection3 = poolManager.getResource();
        System.out.println(connection3);

        DBConnection connection4 = poolManager.getResource();
        System.out.println(connection4);

        DBConnection connection5 = poolManager.getResource();
        System.out.println(connection5);

        // only 6 objs available in pool, so this will return null
        System.out.println(poolManager.getResource());

        poolManager.releaseResource(connection1);

        // one obj has been freed, so this will return a connection
        DBConnection connection6 = poolManager.getResource();
        System.out.println(connection6);

    }
}
