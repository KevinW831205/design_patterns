package com.github.kevinw831205.structural.bridge.practice;

public class VectorSquare extends Square {
    @Override
    public String toString() {
        return String.format("Drawing %s as pixels", getName());
    }
}
