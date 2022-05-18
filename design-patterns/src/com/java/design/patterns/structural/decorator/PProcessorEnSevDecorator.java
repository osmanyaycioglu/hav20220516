package com.java.design.patterns.structural.decorator;

import com.java.design.patterns.common.Person;

public class PProcessorEnSevDecorator extends PProcessor {

    private final PProcessor personProcessor;

    public PProcessorEnSevDecorator(final PProcessor personProcessorParam) {
        super();
        this.personProcessor = personProcessorParam;
    }

    @Override
    public String getGreetingString(final Person personParam) {
        return "En sevdiğim " + this.personProcessor.getGreetingString(personParam);
    }

}
