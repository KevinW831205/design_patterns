package com.github.kevinw831205;

import com.github.kevinw831205.creational.builder.*;
import com.github.kevinw831205.creational.factory.Point;

public class Main {

    public static void main(String[] args) {
        HtmlBuilder hb = new HtmlBuilder("ul");
        hb.addChild("li","hello")
            .addChild("li","world");
//        hb.addChild("li","world");
        System.out.println(hb.toString());

        EmployeeBuilder eb = new EmployeeBuilder();
        Person x = eb
                .withName("x")
                .worksAt("d")
                .build();


        ComplexPersonBuilder cpb = new ComplexPersonBuilder();
        ComplexPerson cp = cpb
                .lives()
                    .address("street")
                    .city("d")
                    .postcode("1")
                .works()
                    .worksAt("c")
                    .position("d")
                .build();

        System.out.println(cp);

        CodeBuilder cb = new CodeBuilder("Person").addField("name","String").addField("age","int");
        System.out.println(cb.toString());


        Point point = new Point.Factory.newCartesianPoint(0,0);
    }
}
