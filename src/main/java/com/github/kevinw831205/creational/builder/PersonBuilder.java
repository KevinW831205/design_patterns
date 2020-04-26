package com.github.kevinw831205.creational.builder;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    protected Person person = new Person();

    public SELF withName(String name) {
        person.setName(name);
        return self();
    }

    public Person build() {
        return person;
    }

    protected SELF self(){
        return (SELF) this;
    }
}
