package com.java.design.patterns.structural.composite;


public class MyFileRun {

    public static void main(final String[] args) {
        MyFile root = new MyFolder("root").addFile(new MyFile("child11"))
                                          .addFile(new MyFile("child12"))
                                          .addFile(new MyFolder("childFolder11").addFile(new MyFolder("childFolder11_2").addFile(new MyFile("child11_21")))
                                                                                .addFile(new MyFolder("childFolder11_3").addFile(new MyFile("child11_31"))))
                                          .addFile(new MyFolder("childFolder12").addFile(new MyFolder("childFolder12_2").addFile(new MyFile("child12_21"))));
        System.out.println(root.toDir(0));
    }
}
