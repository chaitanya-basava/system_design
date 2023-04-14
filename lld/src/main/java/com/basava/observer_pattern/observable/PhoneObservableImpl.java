package com.basava.observer_pattern.observable;

import com.basava.observer_pattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneObservableImpl implements StockObservable {
    private final List<NotificationObserver> observers = new ArrayList<>();
    private int stock = 0;

    @Override
    public void add(NotificationObserver obj) { observers.add(obj); }

    @Override
    public void remove(NotificationObserver obj) { observers.remove(obj); }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver observer: observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int quantity) {
        int oldStock = getStock();
        this.stock += quantity;

        if(oldStock == 0 && getStock() > 0) {
            this.notifySubscribers();
        }
    }

    @Override
    public int getStock() { return stock; }
}
