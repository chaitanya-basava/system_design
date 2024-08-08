package com.basava.behavioral.template_method_pattern;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validate() {
        System.out.println("Validating the merchant's account");
    }

    @Override
    public void calculateFee() {
        System.out.println("Fee for this transaction is 2%");
    }
}
