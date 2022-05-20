package com.java.design.patterns.structural.bridge.araba;


public class ArabaRun {

    public static void main(final String[] args) {
        BMW bmwLoc = new BMW(new Manuel(),
                             new Benzinli());
        bmwLoc.ileriGit();
    }
}
