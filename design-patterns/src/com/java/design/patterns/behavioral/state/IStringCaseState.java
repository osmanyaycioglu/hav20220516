package com.java.design.patterns.behavioral.state;


public interface IStringCaseState {

    IStringCaseState upper();

    IStringCaseState lower();

    String getString(String str);

}
