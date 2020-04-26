package com.github.kevinw831205.creational.builder;

import java.util.Collections;

public class CodeBuilder {
    private String className;
    private StringBuilder sb = new StringBuilder();

    public CodeBuilder(String className) {
        // todo
        this.className = className;
        sb.append(String.format("public class %s",className))
            .append("\n{\n");
    }

    public CodeBuilder addField(String name, String type) {
        // todo
        sb.append(String.join("", Collections.nCopies(2, " ")))
                .append("public ")
                .append(type)
                .append(" ")
                .append(name)
                .append(";\n");
        return this;
    }

    @Override
    public String toString() {
        // todo
        sb.append("}");
        return sb.toString();
    }
}
