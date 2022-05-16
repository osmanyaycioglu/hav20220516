package com.java.design.patterns.creational.factory;


public class HelloTr implements IHello {

    @Override
    public String sayHello(final String nameParam) {
        return "Selam " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Güle güle " + nameParam;
    }


}
