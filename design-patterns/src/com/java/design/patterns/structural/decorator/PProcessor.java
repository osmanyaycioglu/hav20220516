package com.java.design.patterns.structural.decorator;

import com.java.design.patterns.common.Person;

public class PProcessor {

    public String getGreetingString(final Person personParam) {
        return personParam.getName() + " " + personParam.getSurname();
    }

}
