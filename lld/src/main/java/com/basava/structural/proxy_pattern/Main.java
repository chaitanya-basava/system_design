package com.basava.structural.proxy_pattern;

import com.basava.structural.proxy_pattern.service.DBService;
import com.basava.structural.proxy_pattern.service.ProxyDBService;
import com.basava.structural.proxy_pattern.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new ProxyDBService(new DBService());

        try {
            System.out.println(service.execute("ADMIN"));
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(service.execute("USER"));
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
