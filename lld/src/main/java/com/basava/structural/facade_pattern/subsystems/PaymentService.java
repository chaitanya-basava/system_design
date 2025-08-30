package com.basava.structural.facade_pattern.subsystems;

public class PaymentService {
    public boolean makePayment(double amount) {
        System.out.println("Processing payment of: " + amount);
        return true;
    }
}
