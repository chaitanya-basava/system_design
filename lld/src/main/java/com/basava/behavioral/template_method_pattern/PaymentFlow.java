package com.basava.behavioral.template_method_pattern;

public abstract class PaymentFlow {
    public abstract void validate();
    public abstract void calculateFee();

    public void debitAmount() {
        System.out.println("Debiting the amount from the user's account");
    }

    public void creditAmount() {
        System.out.println("Crediting the amount to the friend's account");
    }

    public final void processPayment() {
        validate();
        calculateFee();
        debitAmount();
        creditAmount();
    }
}
