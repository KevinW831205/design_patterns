package com.github.kevinw831205.creational.singleton;

public class InnerStaticSingleton {

    private InnerStaticSingleton(){}

    private static class Impl{
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getINSTANCE(){
        return Impl.INSTANCE;
    }
}
