package com.github.kevinw831205.creational.singleton.Multiton;

import java.util.HashMap;

public class Printer {
    private static int instanceCount = 0;
    private Printer(){
        instanceCount++;
        System.out.println("A total of "+instanceCount+" printer was created");
    }

    private static HashMap<Subsystem, Printer> instances = new HashMap<>();

    public static Printer get(Subsystem subsystem){
        if(instances.containsKey(subsystem)){
            return instances.get(subsystem);
        }

        Printer instance = new Printer();
        instances.put(subsystem,instance);
        return instance;
    }



}
