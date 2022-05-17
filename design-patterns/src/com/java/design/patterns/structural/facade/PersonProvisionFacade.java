package com.java.design.patterns.structural.facade;

import com.java.design.patterns.common.Person;

public class PersonProvisionFacade {

    PersonCheckWS checkWSLoc   = new PersonCheckWS();
    PersonDao     personDaoLoc = new PersonDao();

    public void prepareAndWritePerson(final Person personParam) {
        this.checkWSLoc.checkData(personParam);
        this.checkWSLoc.checkFraud(personParam);
        this.personDaoLoc.insertPerson(personParam);
    }

    public void activatePerson(final Person personParam) {
        this.checkWSLoc.syncData(personParam);
        this.personDaoLoc.insertPersonAction(personParam,
                                             "added");
        this.personDaoLoc.updatePerson(personParam);

    }

}
