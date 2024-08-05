package com.basava.structural.proxy_pattern.service;

import java.util.Objects;

public class ProxyDBService implements Service {
    private final Service realService;

    public ProxyDBService(Service service) {
        this.realService = service;
    }
    @Override
    public String execute(String user) throws Error {
        if (Objects.equals(user, "ADMIN")) return this.realService.execute(user);
        throw new Error("only ADMIN can insert values, passed " + user);
    }
}
