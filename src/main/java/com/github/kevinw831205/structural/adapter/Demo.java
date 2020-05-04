package com.github.kevinw831205.structural.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    private final static List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
            new VectorRectangle(1,1,10,10),
            new VectorRectangle(2,2,4,4)
    ));

    // to draw the VectorRectangle using this method need adapter
    public static void drawPoint(Point p){
        System.out.println(".");
    }

    private static void draw(){
        for (VectorObject vo : vectorObjects){
            for (Line line : vo){
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(Demo::drawPoint);
            }
        }
    }

    public static void main(String[] args) {
        draw();
    }
}
