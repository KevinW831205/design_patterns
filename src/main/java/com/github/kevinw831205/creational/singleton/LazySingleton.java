package com.github.kevinw831205.creational.singleton;

public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton(){
        System.out.println("initialize lazy singleton");
    }

    // multi threading doesn't work well
    public static LazySingleton getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE =  new LazySingleton();
        }
        return INSTANCE;
    }
}
