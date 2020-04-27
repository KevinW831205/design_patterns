package com.github.kevinw831205.creational.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person john = new Person(new String[]{"John", "Smith"}, new Address("London Road",123));

        Person jane = (Person) john.clone();
        jane.getNames()[0] = "Jane";
        jane.getAddress().setHouseNumber(345);

        System.out.println(john);
        System.out.println(jane);
    }
}
