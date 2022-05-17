package com.java.design.patterns.behavioral.command;

import java.util.Scanner;

public class CalculatorXRun {

    public static void main(final String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            CalculatorX calculatorXLoc = new CalculatorX(scannerLoc,
                                                         ECalculatorType.STANDART);
            while (true) {
                calculatorXLoc.showMenu();
                int commandIndexLoc = calculatorXLoc.getCommandIndex();
                double[] parametersLoc = calculatorXLoc.getParameters(commandIndexLoc);
                double resultLoc = calculatorXLoc.execute(commandIndexLoc,
                                                          parametersLoc);
                System.out.println("Sonuç : " + resultLoc);
                System.out.println("-------------");
            }
        } catch (Exception eLoc) {
            // TODO: handle exception
        }
    }
}
