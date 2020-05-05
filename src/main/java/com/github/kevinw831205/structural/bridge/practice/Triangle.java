package com.github.kevinw831205.structural.bridge.practice;

public class Triangle extends Shape {
    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName()
    {
        return "Drawing Squares as "+renderer.whatToRenderAs();
    }

    @Override
    public String toString() {
        return "Drawing Triangles as "+renderer.whatToRenderAs();
    }
}
