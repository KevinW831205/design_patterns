package com.github.kevinw831205.structural.decorator.adapterDecorator;

public class Demo {
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();
        msb.append("Hello");
        msb.appendLine(" World");
        System.out.println(msb.concat("new thing"));
    }
}
