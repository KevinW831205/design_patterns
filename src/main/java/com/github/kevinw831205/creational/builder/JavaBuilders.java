package com.github.kevinw831205.creational.builder;

public class JavaBuilders {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println("<p>" + hello + "</p>");
        String[] words = {"hello", "world"};
//        System.out.println("<ul>" + ".....");

        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word : words) {
            sb.append(String.format("  <li>%s</li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb.toString());
    }

}
