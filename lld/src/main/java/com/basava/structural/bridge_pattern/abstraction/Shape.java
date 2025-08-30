package com.basava.structural.bridge_pattern.abstraction;

import com.basava.structural.bridge_pattern.implementor.Renderer;

public abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
