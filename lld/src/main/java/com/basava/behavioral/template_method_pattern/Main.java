package com.basava.behavioral.template_method_pattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();
        paymentFlow.processPayment();

        System.out.println("====================================");

        paymentFlow = new PayToMerchant();
        paymentFlow.processPayment();
    }
}
