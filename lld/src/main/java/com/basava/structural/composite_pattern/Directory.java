package com.basava.structural.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String name;
    List<FileSystem> children = new ArrayList<>();

    Directory(String name) {
        this.name = name;
    }

    void add(FileSystem fs) {
        children.add(fs);
    }

    @Override
    public double getSize() {
        double sizes = 0;
        for (FileSystem fs: children) {
             sizes += fs.getSize();
        }

        return sizes;
    }
}
