package com.java.design.patterns.common;


public class StringRun {

    public static void main(String[] args) {
        String stringLoc = "osman";
        String backupStringLoc = stringLoc;
        stringLoc += " yaycıoğlu";
        System.out.println(stringLoc);
        System.out.println(backupStringLoc);
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
        }
        System.gc();
        long delta = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder(100_000);
        builder.append("osman yaycıoğlu");
        for (int iLoc = 0; iLoc < 100_000; iLoc++) {
            builder.append(iLoc);
            // stringLoc += iLoc;
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));
        String string2Loc = "osman" + stringLoc + " sdfghjdf" + builder.toString();
        string2Loc += "gdgdgd"; // New instance

        String concatLoc = string2Loc.concat("shshs");
        String str = new String("mehmet");
        if (str.equals("mehmet")) {
            System.out.println("Eşit");
        }

    }
}