package com.basava.creational.prototype_pattern;

public class Student implements Prototype {
    private String name;
    private final int age;
    private final String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(name, age, address);
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}
