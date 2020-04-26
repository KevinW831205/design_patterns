package com.github.kevinw831205.creational.builder;

public class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.setName(rootName);
    }

    public HtmlBuilder addChild(String childName, String childText) {
        HtmlElement e =  new HtmlElement(childName, childText);
        root.getElements().add(e);
        return this;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
