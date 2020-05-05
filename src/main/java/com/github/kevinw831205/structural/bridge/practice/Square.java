package com.github.kevinw831205.structural.bridge.practice;

public class Square extends Shape {
    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName()
    {
        return "Drawing Squares as "+renderer.whatToRenderAs();
    }

    @Override
    public String toString() {
        return "Drawing Squares as "+renderer.whatToRenderAs();
    }
}
