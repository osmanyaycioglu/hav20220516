package com.java.design.patterns.structural.proxy;


public class ProcessorFactory {

    public static PersonProcessor createPersonProcessor() {
        return new PersonProcessorProxy();
    }
}
