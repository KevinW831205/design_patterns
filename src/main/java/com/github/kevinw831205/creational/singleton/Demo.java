package com.github.kevinw831205.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

    static void saveToFile(BasicSingleton singleton, String filename) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(filename); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static void saveToFile(EnumSingleton singleton, String filename) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(filename); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename); ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (BasicSingleton) in.readObject();
        }
    }

    static EnumSingleton readEnumFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename); ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (EnumSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
//        BasicSingleton singleton = BasicSingleton.getInstance();
//
//        singleton.setI(10);
////        System.out.println(singleton.getI());
//
//        String filename = "singleton.bin";
//        saveToFile(singleton,filename);
//
//        singleton.setI(20);
//        BasicSingleton singleton2 = readFromFile(filename);
//
//        System.out.println(singleton == singleton2);
//
//        System.out.println(singleton.getI());
//        System.out.println(singleton2.getI());




//        String filename = "myfile.bin";
//
//        // not really serialized because of constructor
//        EnumSingleton singleton = EnumSingleton.INSTANCE;
////        singleton.setValue(111);
////        saveToFile(singleton,filename);
////        System.out.println(singleton.getValue());
//
//        EnumSingleton singleton2 = readEnumFromFile(filename);
//        System.out.println(singleton2.getValue());

        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        ceo.setName("1");
        ceo.setAge(2);

        ChiefExecutiveOfficer ceo2 = new ChiefExecutiveOfficer();
        System.out.println(ceo2);


    }
}
