package com.java.design.patterns.structural.adapter.lib;


public class MyCode {

    public static void main(final String[] args) {
        LibHelper helperLoc = new LibHelper();
        LibObjHelper libObjLoc = new LibObjHelper();
        System.out.println(helperLoc.xyz(libObjLoc));
    }
}
