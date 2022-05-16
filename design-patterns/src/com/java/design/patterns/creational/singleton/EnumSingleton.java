package com.java.design.patterns.creational.singleton;


public enum EnumSingleton {

    INSTANCE;


    private EnumSingleton() {
    }

    public void test() {
        System.out.println("Lazy test");
    }
}
