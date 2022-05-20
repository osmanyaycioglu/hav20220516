package com.java.design.patterns.behavioral.iterator;


public class MyDataRun {

    public static void main(final String[] args) {
        MyData dataLoc = new MyData();
        dataLoc.add("osman1");
        dataLoc.add("osman2");
        dataLoc.add("osman3");

        for (String stringLoc : dataLoc) {
            System.out.println(stringLoc);
        }

        System.out.println("-------------");
        IMyIterator<String> myIteratorLoc = dataLoc.getMyIterator();
        while (myIteratorLoc.hasNext()) {
            String nextLoc = myIteratorLoc.getNext();
            System.out.println(nextLoc);
        }
    }
}
