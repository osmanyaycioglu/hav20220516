package com.java.design.patterns.structural.decorator;

import com.java.design.patterns.common.Person;

public class PProcessorHazretleriDecorator extends PProcessor {

    private final PProcessor personProcessor;

    public PProcessorHazretleriDecorator(final PProcessor personProcessorParam) {
        super();
        this.personProcessor = personProcessorParam;
    }

    @Override
    public String getGreetingString(final Person personParam) {
        return this.personProcessor.getGreetingString(personParam) + " Hazretleri";
    }

}
