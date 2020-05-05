package com.github.kevinw831205.structural.adapter;

public class SquareToRectangleAdapter implements Rectangle {
    private int width;
    private int height;

    public SquareToRectangleAdapter(Square square)
    {
        // todo
        width = square.side;
        height = square.side;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
