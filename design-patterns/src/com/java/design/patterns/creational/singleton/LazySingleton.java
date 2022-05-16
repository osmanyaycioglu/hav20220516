package com.java.design.patterns.creational.singleton;


public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {
        // Cache i doldur
    }

    public static LazySingleton getInstance() {
        if (LazySingleton.instance == null) {
            synchronized (LazySingleton.class) {
                if (LazySingleton.instance == null) {
                    LazySingleton.instance = new LazySingleton();
                }
            }
        }
        return LazySingleton.instance;
    }

    public void test() {
        System.out.println("Lazy test");
    }

}
