package com.java.design.patterns.structural.proxy;

import com.java.design.patterns.common.Person;

public class PersonProcessorProxyDelegated extends PersonProcessor {

    private final PersonProcessor personProcessor;

    public PersonProcessorProxyDelegated(final PersonProcessor personProcessorParam) {
        super();
        this.personProcessor = personProcessorParam;
    }

    @Override
    public String getGreetingString(final Person personParam) {
        String greetingStringLoc = this.personProcessor.getGreetingString(personParam);
        return "En sevdiğim " + greetingStringLoc;
    }

}
