package com.java.design.patterns.structural.proxy;

import com.java.design.patterns.common.Person;

public class PersonProcessorProxy extends PersonProcessor {

    @Override
    public String getGreetingString(final Person personParam) {
        personParam.setName(personParam.getName() + " test");
        String greetingStringLoc = super.getGreetingString(personParam);
        return "Sevgili " + greetingStringLoc;
    }

}
