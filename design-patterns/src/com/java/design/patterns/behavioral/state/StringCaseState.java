package com.java.design.patterns.behavioral.state;


public class StringCaseState implements IStringCaseState {

    private IStringCaseState current = new LowerCase();


    @Override
    public String getString(final String strParam) {
        return this.current.getString(strParam);
    }

    @Override
    public IStringCaseState upper() {
        IStringCaseState changeLoc = this.current.upper();
        this.current = changeLoc;
        return this.current;
    }

    @Override
    public IStringCaseState lower() {
        IStringCaseState changeLoc = this.current.lower();
        this.current = changeLoc;
        return this.current;
    }


}
