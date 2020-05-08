package com.github.kevinw831205.structural.decorator.practice;

public class Dragon {
    private int age;
    private Bird bird = new Bird();
    private Lizard lizard = new Lizard();

    public void setAge(int age)
    {
        this.age = age;
        this.bird.age = age;
        this.lizard.age = age;
    }
    public String fly()
    {
        return this.bird.fly();
    }
    public String crawl()
    {
        return this.lizard.crawl();
    }
}
