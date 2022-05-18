package com.java.design.patterns.structural.proxy;

import com.java.design.patterns.common.Person;

public class PersonProcessor {

    public String getGreetingString(final Person personParam) {
        return "Sayın " + personParam.getName() + " " + personParam.getSurname();
    }

}
