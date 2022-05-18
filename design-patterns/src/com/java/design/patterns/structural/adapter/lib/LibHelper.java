package com.java.design.patterns.structural.adapter.lib;


public class LibHelper {

    private final Lib libLoc = new Lib();

    public String xyz(final LibObjHelper obj) {
        return this.libLoc.xyz(new LibObjAdapter(obj));
    }
}
