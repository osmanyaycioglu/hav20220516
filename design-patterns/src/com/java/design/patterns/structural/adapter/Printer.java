package com.java.design.patterns.structural.adapter;

import com.java.design.patterns.common.Person;

public class Printer {

    public void print(final Person personParam) {
        System.out.println("Sayın " + personParam.getName() + " " + personParam.getSurname());
    }

}
