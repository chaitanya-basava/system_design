package com.basava.composite_pattern;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");

        root.add(new File("file1", 10));
        root.add(new File("file2", 20));
        root.add(bin);

        bin.add(new File("file3", 30));

        System.out.println(root.name + " " + root.getSize());
        System.out.println(bin.name + " " + bin.getSize());
    }
}
