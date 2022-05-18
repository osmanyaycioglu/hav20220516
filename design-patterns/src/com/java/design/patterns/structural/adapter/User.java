package com.java.design.patterns.structural.adapter;


public class User {

    private String nameAndSurname;
    private String username;

    public String getNameAndSurname() {
        return this.nameAndSurname;
    }

    public void setNameAndSurname(final String nameAndSurnameParam) {
        this.nameAndSurname = nameAndSurnameParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

}
