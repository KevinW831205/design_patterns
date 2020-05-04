package com.github.kevinw831205.creational.singleton;

import java.io.Serializable;

public enum EnumSingleton implements Serializable {
    INSTANCE;
    // cannot inherit
    // difficult to persist state;

    private int value;

    EnumSingleton() {
        this.value = 42;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
