package com.github.kevinw831205.creational.singleton;

import java.util.function.Supplier;

public class SingletonTester {

    public static boolean isSingleton(Supplier<Object> func){
        Object singleton1 = func.get();
        Object singleton2 = func.get();
        return singleton1 == singleton2;
    }
}
