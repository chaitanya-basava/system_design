package com.basava.structural.facade_pattern;

import com.basava.structural.facade_pattern.facade.OrderFacade;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        boolean success = orderFacade.placeOrder("product123", 100.0, "123 Main St, Anytown, USA");
        System.out.println("Order placed successfully: " + success);
    }
}
