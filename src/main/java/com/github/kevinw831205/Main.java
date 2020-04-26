package com.github.kevinw831205;

import com.github.kevinw831205.creational.builder.EmployeeBuilder;
import com.github.kevinw831205.creational.builder.HtmlBuilder;
import com.github.kevinw831205.creational.builder.Person;

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
    }
}
