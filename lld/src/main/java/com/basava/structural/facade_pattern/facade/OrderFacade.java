package com.basava.structural.facade_pattern.facade;

import com.basava.structural.facade_pattern.subsystems.InventoryService;
import com.basava.structural.facade_pattern.subsystems.PaymentService;
import com.basava.structural.facade_pattern.subsystems.ShippingService;

public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public boolean placeOrder(String productId, double amount, String address) {
        System.out.println("Starting order placement process...");
        if (inventoryService.checkStock(productId) && paymentService.makePayment(amount)) {
                shippingService.shipProduct(productId, address);
                System.out.println("Order placed successfully!");
                return true;
            }

        System.out.println("Order placement failed!");
        return false;
    }
}
