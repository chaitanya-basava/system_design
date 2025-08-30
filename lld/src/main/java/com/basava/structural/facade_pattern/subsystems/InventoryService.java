package com.basava.structural.facade_pattern.subsystems;

public class InventoryService {
    public boolean checkStock(String productId) {
        System.out.println("Checking stock for product: " + productId);
        return true;
    }
}
