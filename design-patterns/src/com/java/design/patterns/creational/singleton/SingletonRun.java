package com.java.design.patterns.creational.singleton;


public class SingletonRun {

    public static void main(final String[] args) {
        LazySingleton.getInstance()
                     .test();

        EnumSingleton.INSTANCE.test();

    }
}
