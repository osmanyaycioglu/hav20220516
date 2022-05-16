package com.java.design.patterns.creational.singleton;

import com.java.design.patterns.creational.factory.IHello;

public class StatusRun {

    public static void main(final String[] args) {
        EStatus status = EStatus.STOPPED;
        status.printStatus();

        IHello hello = EStatus.RUNNING;
        hello.sayHello("osman");
    }
}
