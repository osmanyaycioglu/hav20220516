package com.java.design.patterns.creational.factory;


public class HelloEsp implements IHello {

    @Override
    public String sayHello(final String nameParam) {
        return "Ola " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Adios " + nameParam;
    }


}
