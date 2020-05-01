package com.github.kevinw831205.creational.singleton;

public class BasicSingleton {
    int i = 0;

    public BasicSingleton() {
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}




