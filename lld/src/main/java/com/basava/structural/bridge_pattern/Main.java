package com.basava.structural.bridge_pattern;

import com.basava.structural.bridge_pattern.abstraction.Circle;
import com.basava.structural.bridge_pattern.abstraction.Rectangle;
import com.basava.structural.bridge_pattern.abstraction.Shape;
import com.basava.structural.bridge_pattern.implementor.RasterRenderer;
import com.basava.structural.bridge_pattern.implementor.Renderer;
import com.basava.structural.bridge_pattern.implementor.VectorRenderer;

public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circle1 = new Circle(vector, 5);
        Shape circle2 = new Circle(raster, 5);

        Shape rectangle1 = new Rectangle(vector, 10, 4);
        Shape rectangle2 = new Rectangle(raster, 10, 4);

        circle1.draw();
        circle2.draw();
        rectangle1.draw();
        rectangle2.draw();
    }
}
