package com.java.design.patterns.structural.adapter.lib;


public class LibObjAdapter extends LibObj {

    private final LibObjHelper helperObj;

    public LibObjAdapter(final LibObjHelper helperObjParam) {
        super();
        this.helperObj = helperObjParam;
    }

    @Override
    public String getName() {
        return this.helperObj.getName();
    }

    @Override
    public void setName(final String nameParam) {
        this.helperObj.setName(nameParam);
    }

    @Override
    public void sync() {
        this.helperObj.test();
    }
}
