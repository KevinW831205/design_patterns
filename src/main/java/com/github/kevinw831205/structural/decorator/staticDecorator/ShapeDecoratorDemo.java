package com.github.kevinw831205.structural.decorator.staticDecorator;

public class ShapeDecoratorDemo {
    public static void main(String[] args) {
        ColoredShape<Shape> blueSquare = new ColoredShape<>(() -> new Square(5), "Blue");
        System.out.println(blueSquare.info());

        TransparentShape<ColoredShape<Circle>> myCircle = new TransparentShape<>(
                () -> new ColoredShape<>(
                        () -> new Circle(5), "yellow"
                ), 50
        );
        System.out.println(myCircle.info());
    }
}
