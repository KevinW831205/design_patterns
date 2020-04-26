package com.github.kevinw831205.creational.builder;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
    private String name;
    private String text;
    private ArrayList<HtmlElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();


    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent * indentSize, " "));
        sb.append(String.format("%s<%s>%s", i, name, newLine));
        if (text != null && !text.isEmpty()) {
            sb.append(String.join("", Collections.nCopies(indentSize * (indent + 1), "")))
                    .append(text)
                    .append(newLine);
        }

        for(HtmlElement e : elements){
            sb.append(e.toStringImpl(indent+1));
        }

        sb.append(String.format("%s</%s>%s",i,name,newLine));
        return sb.toString();

    }

    @Override
    public String toString() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<HtmlElement> getElements() {
        return elements;
    }

    public void setElements(ArrayList<HtmlElement> elements) {
        this.elements = elements;
    }
}
