package com.github.kevinw831205.creational.builder;

public class ComplexPersonAddressBuilder extends ComplexPersonBuilder {

    public ComplexPersonAddressBuilder(ComplexPerson person) {
        this.person=person;
    }

    public ComplexPersonAddressBuilder address(String streetAddress){
        person.setStreetAddress(streetAddress);
        return this;
    }

    public ComplexPersonAddressBuilder postcode(String postcode){
        person.setPostcode(postcode);
        return this;
    }

    public ComplexPersonAddressBuilder city(String city){
        person.setCity(city);
        return this;
    }
}
