package com.basava.structural.composite_pattern;

public class File implements FileSystem {
    String name;
    double size;

    File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }
}
