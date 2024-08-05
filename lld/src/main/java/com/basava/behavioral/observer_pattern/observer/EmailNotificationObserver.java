package com.basava.behavioral.observer_pattern.observer;

import com.basava.behavioral.observer_pattern.observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver {
    private final StockObservable obj;
    private final String email;

    public EmailNotificationObserver(String email, StockObservable obj) {
        this.obj = obj;
        this.email = email;
    }

    @Override
    public void update() { sendEmail(); }

    private void sendEmail() {
        System.out.println("Email sent to " + this.email);
        System.out.println("New quantity available: " + obj.getStock());
    }
}
