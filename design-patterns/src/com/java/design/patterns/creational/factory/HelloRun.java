package com.java.design.patterns.creational.factory;

import java.util.Scanner;

public class HelloRun {

    public void run() {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            HelloFactory.showMenu();
            System.out.println("Seçiminiz : ");
            int indexLoc = scannerLoc.nextInt();

            IHello engLoc = HelloFactory.createHello(indexLoc);

            System.out.println(engLoc.sayHello("osman"));
            System.out.println(engLoc.sayGoodbye("osman"));
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        HelloRun helloRunLoc = new HelloRun();
        helloRunLoc.run();
    }
}
