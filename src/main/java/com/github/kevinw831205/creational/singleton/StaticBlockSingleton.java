package com.github.kevinw831205.creational.singleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private StaticBlockSingleton() throws IOException{
        System.out.println("initializing");
        File.createTempFile(".",".");
    }

    private static StaticBlockSingleton INSTANCE;


    static {
        try{
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e){
            System.err.println("failed to create singleton");
        }
    }

    public static StaticBlockSingleton getINSTANCE() {
        return INSTANCE;
    }
}
