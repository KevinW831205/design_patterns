package com.github.kevinw831205;

import com.github.kevinw831205.creational.builder.HtmlBuilder;

public class Main {

    public static void main(String[] args) {
        HtmlBuilder hb = new HtmlBuilder("ul");
        hb.addChild("li","hello")
            .addChild("li","world");
//        hb.addChild("li","world");
        System.out.println(hb.toString());
    }
}
