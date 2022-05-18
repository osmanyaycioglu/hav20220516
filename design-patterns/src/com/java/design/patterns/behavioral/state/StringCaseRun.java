package com.java.design.patterns.behavioral.state;


public class StringCaseRun {

    public static void main(final String[] args) {
        StringCaseState caseStateLoc = new StringCaseState();
        System.out.println(caseStateLoc.getString("osman"));
        caseStateLoc.upper();
        System.out.println(caseStateLoc.getString("osman"));
        caseStateLoc.upper();
        System.out.println(caseStateLoc.getString("osman"));
        caseStateLoc.upper();
        System.out.println(caseStateLoc.getString("osman"));
        caseStateLoc.lower();
        System.out.println(caseStateLoc.getString("osman"));
        System.out.println(caseStateLoc.getString("osman"));
        caseStateLoc.upper();
        System.out.println(caseStateLoc.getString("osman"));
        System.out.println(caseStateLoc.getString("osman"));
        System.out.println(caseStateLoc.getString("osman"));

    }
}
