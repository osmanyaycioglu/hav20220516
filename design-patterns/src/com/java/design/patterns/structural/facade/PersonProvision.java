package com.java.design.patterns.structural.facade;

import com.java.design.patterns.common.Person;

// Business layer
public class PersonProvision {

    public void provision(final Person personParam) {
        PersonProvisionFacade personProvisionFacadeLoc = new PersonProvisionFacade();
        personProvisionFacadeLoc.prepareAndWritePerson(personParam);
        personProvisionFacadeLoc.activatePerson(personParam);
    }

}

