package com.github.kevinw831205.structural.bridge.practice;

public abstract class Shape {
    public abstract String getName();
    public Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }
}
