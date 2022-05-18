package com.java.design.patterns.behavioral.state;


public class LowerCase implements IStringCaseState {

    @Override
    public IStringCaseState upper() {
        return new UpperCase();
    }

    @Override
    public String getString(final String strParam) {
        return strParam.toLowerCase();
    }

    @Override
    public IStringCaseState lower() {
        return this;
    }

}
