package com.java.design.patterns.structural.adapter;

import com.java.design.patterns.common.Person;

public class UserPersonAdapter extends Person {

    private final User   user;
    private final String name;
    private final String surname;

    public UserPersonAdapter(final User userParam) {
        super();
        this.user = userParam;
        String nameAndSurnameLoc = userParam.getNameAndSurname();
        String[] splitLoc = nameAndSurnameLoc.split(" ");
        this.name = splitLoc[0];
        this.surname = splitLoc[1];
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

}
