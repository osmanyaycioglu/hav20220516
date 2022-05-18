package com.java.design.patterns.structural.proxy;

import com.java.design.patterns.common.Person;

public class ProcessorRun {

    public static void main(final String[] args) {
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yay");
        PersonProcessor processorLoc = ProcessorFactory.createPersonProcessor();
        System.out.println(" Greeting : "
                           + new PersonProcessorProxyDelegated(processorLoc).getGreetingString(personLoc));

    }
}

