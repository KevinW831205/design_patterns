package com.github.kevinw831205.structural.bridge.practice;

public class RasterSquare extends Square {
    @Override
    public String toString()
    {
        return String.format("Drawing %s as lines", getName());
    }
}
