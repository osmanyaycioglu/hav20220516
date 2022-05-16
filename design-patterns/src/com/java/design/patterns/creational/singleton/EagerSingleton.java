package com.java.design.patterns.creational.singleton;


public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Cache i doldur
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.instance;
    }

}
