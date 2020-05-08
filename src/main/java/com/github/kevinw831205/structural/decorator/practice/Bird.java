package com.github.kevinw831205.structural.decorator.practice;

public class Bird {
    public int age;

    public String fly()
    {
        return age < 10 ? "flying" : "too old";
    }
}
