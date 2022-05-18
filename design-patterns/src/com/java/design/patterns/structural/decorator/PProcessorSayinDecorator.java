package com.java.design.patterns.structural.decorator;

import com.java.design.patterns.common.Person;

public class PProcessorSayinDecorator extends PProcessor {

    private final PProcessor personProcessor;

    public PProcessorSayinDecorator(final PProcessor personProcessorParam) {
        super();
        this.personProcessor = personProcessorParam;
    }

    @Override
    public String getGreetingString(final Person personParam) {
        return "Sayın " + this.personProcessor.getGreetingString(personParam);
    }

}
