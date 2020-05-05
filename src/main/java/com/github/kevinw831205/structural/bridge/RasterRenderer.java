package com.github.kevinw831205.structural.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a pixel circle with radius " + radius);
    }
}
