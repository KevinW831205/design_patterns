package com.github.kevinw831205.structural.composite.practice;

import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ManyValue manyValue = new ManyValue();
        manyValue.add(5);
        manyValue.add(3);
        MyList myList = new MyList(Collections.singleton(manyValue));

        System.out.println(myList.sum());
    }
}
