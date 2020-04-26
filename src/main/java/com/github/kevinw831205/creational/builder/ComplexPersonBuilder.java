package com.github.kevinw831205.creational.builder;

public class ComplexPersonBuilder {
    protected ComplexPerson person = new ComplexPerson();


    public ComplexPerson build(){
        return person;
    }

    public ComplexPersonAddressBuilder lives(){
        return new ComplexPersonAddressBuilder(person);
    }

    public ComplexPersonJobBuilder works(){
        return new ComplexPersonJobBuilder(person);
    }
}
