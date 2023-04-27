package com.basava.proxy_pattern.service;

public class DBService implements Service {
    @Override
    public String execute(String user) {
        return "Inserted data shared by " + user;
    }
}
