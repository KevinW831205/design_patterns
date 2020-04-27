package com.github.kevinw831205.creational.factory;

public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Prepared Tea");
        return new Tea();
    }
}
