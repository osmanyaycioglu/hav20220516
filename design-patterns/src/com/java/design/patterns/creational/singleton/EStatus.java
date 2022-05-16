package com.java.design.patterns.creational.singleton;

import com.java.design.patterns.creational.factory.IHello;

public enum EStatus implements IHello {

    STOPPED("Server Stopped") {

        @Override
        public String sayHello(final String nameParam) {
            return "xyz " + nameParam;
        }

        @Override
        public String sayGoodbye(final String nameParam) {
            return "abc " + nameParam;
        }
    },
    RUNNING("Running state"),
    BOOTING("Server booting") {

        @Override
        public void printStatus() {
            System.out.println("BOOTING FOR YOU " + this.getDesc());
        }
    };


    private final String desc;

    private EStatus(final String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void printStatus() {
        System.out.println(this.desc);
    }

    @Override
    public String sayHello(final String nameParam) {
        return "Hello " + nameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam) {
        return "Goodbye " + nameParam;
    }

}
