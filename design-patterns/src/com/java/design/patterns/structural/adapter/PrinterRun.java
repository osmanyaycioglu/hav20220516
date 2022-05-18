package com.java.design.patterns.structural.adapter;

import com.java.design.patterns.common.Person;

public class PrinterRun {

    public static void main(final String[] args) {
        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("yay");
        Printer printerLoc = new Printer();
        printerLoc.print(personLoc);
        System.out.println("-------------");
        User userLoc = new User();
        userLoc.setNameAndSurname("osman yay");
        userLoc.setUsername("osmany");
        printerLoc.print(new UserPersonAdapter(userLoc));

    }
}
