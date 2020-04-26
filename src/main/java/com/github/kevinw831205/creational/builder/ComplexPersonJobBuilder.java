package com.github.kevinw831205.creational.builder;

public class ComplexPersonJobBuilder extends ComplexPersonBuilder{
    public ComplexPersonJobBuilder(ComplexPerson person) {
        this.person = person;
    }

    public ComplexPersonJobBuilder worksAt(String company){
        person.setCompanyName(company);
        return this;
    }

    public ComplexPersonJobBuilder position(String position){
        person.setPosition(position);
        return this;
    }
}
