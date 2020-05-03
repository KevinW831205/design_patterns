package com.github.kevinw831205.creational.singleton;

public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("initialize lazy singleton");
    }

    // multi threading doesn't work well
//    public static synchronized LazySingleton getINSTANCE(){
//        if (INSTANCE == null){
//            INSTANCE =  new LazySingleton();
//        }
//        return INSTANCE;
//    }

    //doub checked locking
    public static LazySingleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
