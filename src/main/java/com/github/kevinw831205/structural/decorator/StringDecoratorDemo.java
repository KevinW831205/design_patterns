package com.github.kevinw831205.structural.decorator;

public class StringDecoratorDemo {
    public static void main(String[] args) {
        StringDecorator s = new StringDecorator("Eello");
        System.out.println(s.getNumberOfVowels());
    }
}
