package com.github.kevinw831205.structural.flyweight;

public class Demo {
    public static void main(String[] args) {
        User user = new User("John Smith");
        User user2 = new User("Jane Smith");

        User2 user2_ = new User2("John Smith");
        User2 user2_2 = new User2("John Smith");
    }
}
