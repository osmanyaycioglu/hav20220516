package com.java.design.patterns.structural.facade;

import com.java.design.patterns.common.Person;


// Integration Layer
public class PersonCheckWS {

    public boolean checkData(final Person person) {
        return true;
    }

    public boolean syncData(final Person person) {
        return true;
    }

    public boolean checkFraud(final Person person) {
        return false;
    }

}
