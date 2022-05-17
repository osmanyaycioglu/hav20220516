package com.java.design.patterns.common.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.design.patterns.common.Person;

public class FileRead {

    public static void main(final String[] args) {
        IMyFuncIntf funcIntfLoc = (a,
                                   b) -> a + " " + b;

        Path pathLoc = Paths.get("person.txt");
        try {
            List<String> readAllLinesLoc = Files.readAllLines(pathLoc);
            List<Person> personListLoc = new ArrayList<>();
            for (String stringLoc : readAllLinesLoc) {
                String[] sa = stringLoc.split(",");
                personListLoc.add(new Person().setName(sa[0])
                                              .setSurname(sa[1])
                                              .setPhone(sa[2])
                                              .setHeight(Integer.parseInt(sa[3])));
            }

            List<Person> collectLoc = readAllLinesLoc.stream()
                                                     .map(s -> s.split(","))
                                                     .filter(sa -> sa.length == 4)
                                                     .map(sa -> new Person().setName(sa[0])
                                                                            .setSurname(sa[1])
                                                                            .setPhone(sa[2])
                                                                            .setHeight(Integer.parseInt(sa[3])))
                                                     .collect(Collectors.toList());

            System.out.println(readAllLinesLoc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
