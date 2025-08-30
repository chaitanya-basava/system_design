package com.basava.structural.bridge_pattern.abstraction;

import com.basava.structural.bridge_pattern.implementor.Renderer;

public class Rectangle extends Shape {
    private final float width;
    private final float height;

    public Rectangle(Renderer renderer, float width, float height) {
        super(renderer);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        renderer.renderRectangle(width, height);
    }
}
