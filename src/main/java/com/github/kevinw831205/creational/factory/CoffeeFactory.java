package com.github.kevinw831205.creational.factory;

public class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("prepare cofee");
        return new Coffee();
    }
}
