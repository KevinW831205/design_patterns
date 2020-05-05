package com.github.kevinw831205.structural.bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Draws circle with radius "+radius);
    }
}
