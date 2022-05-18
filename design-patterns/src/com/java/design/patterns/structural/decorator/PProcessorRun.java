package com.java.design.patterns.structural.decorator;

import java.util.Arrays;

import com.java.design.patterns.common.Person;

public class PProcessorRun {

    public static void main(final String[] args) {
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yay");
        PProcessor pProcessorLoc = PProcessorFactory.createPProcessoressor(Arrays.asList(1,
                                                                                         0,
                                                                                         3,
                                                                                         3,
                                                                                         2,
                                                                                         2));
        System.out.println(pProcessorLoc.getGreetingString(personLoc));
        System.out.println(new PProcessorSayinDecorator(new PProcessorHazretleriDecorator(new PProcessorEnSevDecorator(new PProcessor()))));
    }
}
