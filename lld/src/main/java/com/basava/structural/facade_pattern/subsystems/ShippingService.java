package com.basava.structural.facade_pattern.subsystems;

public class ShippingService {
    public void shipProduct(String productId, String address) {
        System.out.println("Shipping product " + productId + " to address: " + address);
    }
}
