package com.github.kevinw831205.creational.prototype;

import org.apache.commons.lang3.SerializationUtils;

public class Demo {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Person john = new Person(new String[]{"John", "Smith"}, new Address("London Road",123));
//
//        Person jane = (Person) john.clone();
//        jane.getNames()[0] = "Jane";
//        jane.getAddress().setHouseNumber(345);
//
//        System.out.println(john);
//        System.out.println(jane);
//    }

    public static void main(String[] args) {
        Employee john = new Employee("John",new Address2("street","city","country"));
        Employee chris = new Employee(john);

        chris.setName("Chris");
        chris.getAddress().setStreetAddress("streetchris");
        System.out.println(john);
        System.out.println(chris);


        Foo foo = new Foo(42,"what");
        Foo foo2 = SerializationUtils.roundtrip(foo);

        foo2.stuff = 400;
        System.out.println(foo);
        System.out.println(foo2);
    }

}
