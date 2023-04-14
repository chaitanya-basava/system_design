package com.basava.observer_pattern.observable;

import com.basava.observer_pattern.observer.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver obj);

    void remove(NotificationObserver obj);

    void notifySubscribers();

    void setStock(int quantity);

    int getStock();
}
