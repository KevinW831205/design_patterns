package com.github.kevinw831205.structural.composite.practice;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer> {
    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum(){
        int sum =0;
        for(ValueContainer valueContainer:this){
            for(Integer i: valueContainer){
                sum += i;
            }
        }
        return sum;
    }
}
