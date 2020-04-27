package com.github.kevinw831205.creational.factory;

public class PersonFactory {
    int id = 0;

    public Person createPerson(String name){
        return new Person(id++,name);
    }
}
