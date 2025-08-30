package com.basava.structural.bridge_pattern.abstraction;

import com.basava.structural.bridge_pattern.implementor.Renderer;

public class Circle extends Shape {
    private final float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
}
