package com.github.kevinw831205.structural.decorator;

public class ShapeDecoratorDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(new Square(20), "Blue");
        System.out.println(blueSquare.info());

        TransparentShape newCircle = new TransparentShape(
                new ColoredShape(
                        new Circle(5), "green"
                ), 50
        );
        System.out.println(newCircle.info());
    }
}
