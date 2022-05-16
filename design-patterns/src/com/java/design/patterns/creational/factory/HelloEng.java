package com.java.design.patterns.creational.factory;


public class HelloEng implements IHello {

    @Override
    public String sayHello(final String nameParam) {
        return "Hello " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Goodbye " + nameParam;
    }


}
