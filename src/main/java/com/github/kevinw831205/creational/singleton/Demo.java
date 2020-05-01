package com.github.kevinw831205.creational.singleton;

public class Demo {


    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();

        singleton.setI(10);
        System.out.println(singleton.getI());
    }
}
