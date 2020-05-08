package com.github.kevinw831205.structural.decorator.practice;

public class Lizard {
    public int age;

    public String crawl()
    {
        return (age > 1) ? "crawling" : "too young";
    }
}
