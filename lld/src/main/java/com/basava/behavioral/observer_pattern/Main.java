package com.basava.behavioral.observer_pattern;

import com.basava.behavioral.observer_pattern.observable.PhoneObservableImpl;
import com.basava.behavioral.observer_pattern.observer.EmailNotificationObserver;
import com.basava.behavioral.observer_pattern.observer.PushNotificationObserver;

public class Main {
    public static void main(String[] args) {
        PhoneObservableImpl observable = new PhoneObservableImpl();

        EmailNotificationObserver emailObs1 = new EmailNotificationObserver(
                "xyz@gmail.com",
                observable
        );

        EmailNotificationObserver emailObs2 = new EmailNotificationObserver(
                "abc@gmail.com",
                observable
        );

        PushNotificationObserver pnObs1 = new PushNotificationObserver(
                "chaitanya-basava",
                observable
        );

        observable.add(emailObs1);
        observable.add(emailObs2);
        observable.add(pnObs1);

        observable.setStock(10);
        observable.setStock(5);
        observable.setStock(-5);

        System.out.println("------------------------------------");
        observable.remove(emailObs2);

        observable.setStock(-10);
        observable.setStock(5);
    }
}
