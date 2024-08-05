package com.basava.creational.singleton_pattern;

import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        AtomicReference<DBConnection> connection1 = new AtomicReference<>();
        AtomicReference<DBConnection> connection2 = new AtomicReference<>();

        Thread thread1 = new Thread(() -> connection1.set(DBConnection.getInstance()));
        Thread thread2 = new Thread(() -> connection2.set(DBConnection.getInstance()));

        thread1.start();
        thread2.start();

        // wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println(connection1.get() == connection2.get()); // true
    }
}
