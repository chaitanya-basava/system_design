package com.basava.behavioral.observer_pattern.observable;

import com.basava.behavioral.observer_pattern.observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver obj);

    void remove(NotificationObserver obj);

    void notifySubscribers();

    void setStock(int quantity);

    int getStock();
}
