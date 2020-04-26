package com.github.kevinw831205.creational.factory;


public class Point {
    private double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // factory methods move different construction logic outside the constructor
//    public static Point newCartesianPoint(double x, double y) {
//        return new Point(x, y);
//    }
//
//    public static Point newPolarPoint(double rho, double theta){
//        return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
//    }

    public static class Factory{
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta){
            return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
        }
    }
}
