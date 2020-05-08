package com.github.kevinw831205.structural.decorator.staticDecorator;

import java.util.function.Supplier;

public class ColoredShape <T extends Shape> implements Shape {
    private Shape shape;
    private String color;


    public ColoredShape(Supplier<? extends T> ctor, String color) {
        this.shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() +" has the color";
    }
}
