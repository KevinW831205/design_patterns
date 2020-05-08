package com.github.kevinw831205.structural.decorator.staticDecorator;

public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    void resize(float factor){
        radius *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius "+radius;
    }
}
