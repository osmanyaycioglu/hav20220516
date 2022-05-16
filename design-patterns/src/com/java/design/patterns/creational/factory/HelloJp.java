package com.java.design.patterns.creational.factory;


public class HelloJp implements IHello {

    @Override
    public String sayHello(final String nameParam) {
        return "Aha " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Hoha " + nameParam;
    }


}
