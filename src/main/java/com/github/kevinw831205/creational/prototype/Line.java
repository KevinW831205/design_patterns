package com.github.kevinw831205.creational.prototype;

public class Line {
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy()
    {
        // todo
        return new Line(new Point(this.start), new Point(this.end));
    }
}
