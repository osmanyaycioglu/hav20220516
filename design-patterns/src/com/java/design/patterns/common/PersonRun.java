package com.java.design.patterns.common;

import com.java.design.patterns.creational.builder.PersonImmutable;

public class PersonRun {

    public static void main(String[] args) {
        //        PersonImmutable immutableLoc = new PersonImmutable("osman",
        //                                                           "yaycıoğlu",
        //                                                           "32984723",
        //                                                           200);

        Person personLoc = new Person();
        personLoc.setName("osman");
        personLoc.setSurname("323489723");
        personLoc.setSurname("yaycıoğlu");
        personLoc.setHeight(200);

        Person personLoc2 = new Person().setName("osman")
                                        .setSurname("yaycıoğlu")
                                        .setPhone("239048234")
                                        .setHeight(200);

        PersonImmutable buildLoc = PersonImmutable.getBuilder()
                                                  .withName("osman")
                                                  .withSurname("yaycıoğlu")
                                                  .withPhone("43873")
                                                  .withHeight(200)
                                                  .build();


    }
}
