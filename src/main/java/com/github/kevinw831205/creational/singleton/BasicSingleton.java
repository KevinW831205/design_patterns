package com.github.kevinw831205.creational.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {
    // problem with serialization and reflection


    int i = 0;

    public BasicSingleton()  {
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


    // overcome serialization problem
//    protected Object readResolve(){
//        return INSTANCE;
//    }


}




