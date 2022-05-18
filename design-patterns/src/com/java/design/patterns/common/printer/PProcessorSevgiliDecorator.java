package com.java.design.patterns.common.printer;

import com.java.design.patterns.common.Person;

public class PProcessorSevgiliDecorator extends PProcessor {

    private final PProcessor personProcessor;

    public PProcessorSevgiliDecorator(final PProcessor personProcessorParam) {
        super();
        this.personProcessor = personProcessorParam;
    }

    @Override
    public String getGreetingString(final Person personParam) {
        return "Sevgili " + this.personProcessor.getGreetingString(personParam);
    }

}
