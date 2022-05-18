package com.java.design.patterns.behavioral.state;


public class UpperCase implements IStringCaseState {

    @Override
    public IStringCaseState lower() {
        return new LowerCase();
    }

    @Override
    public String getString(final String strParam) {
        return strParam.toUpperCase();
    }

    @Override
    public IStringCaseState upper() {
        return this;
    }

}
