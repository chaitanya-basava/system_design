package com.basava.observer_pattern.observer;

import com.basava.observer_pattern.observable.StockObservable;

public class PushNotificationObserver implements NotificationObserver {
    private final StockObservable obj;
    private final String userName;

    public PushNotificationObserver(String userName, StockObservable obj) {
        this.obj = obj;
        this.userName = userName;
    }

    @Override
    public void update() { sendPN(); }

    private void sendPN() {
        System.out.println("PN sent to " + this.userName + "'s device");
        System.out.println("New quantity available: " + obj.getStock());
    }
}
