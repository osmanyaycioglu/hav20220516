package com.java.design.patterns.behavioral.command;

import java.util.List;
import java.util.Scanner;

public class CalculatorX {

    private final List<ICalculatorCommand> commands;
    private final Scanner                  scanner;


    public CalculatorX(final Scanner scannerParam,
                       final ECalculatorType calculatorTypeParam) {
        this.commands = CalculatorCommandFactory.getCalculatorCommands(calculatorTypeParam);
        this.scanner = scannerParam;
    }

    public void showMenu() {
        int index = 1;
        for (ICalculatorCommand iCalculatorCommandLoc : this.commands) {
            System.out.println(index + "-" + iCalculatorCommandLoc.getName());
            index++;
        }
    }

    public int getCommandIndex() {
        System.out.println("Seçiminiz : ");
        return this.scanner.nextInt();
    }

    public double[] getParameters(final int index) {
        ICalculatorCommand iCalculatorCommandLoc = this.commands.get(index - 1);
        int inputParamCountLoc = iCalculatorCommandLoc.getInputParamCount();
        double[] returnVal = new double[inputParamCountLoc];
        for (int iLoc = 0; iLoc < inputParamCountLoc; iLoc++) {
            System.out.println("Değişken " + (iLoc + 1) + " : ");
            returnVal[iLoc] = this.scanner.nextDouble();
        }
        return returnVal;
    }

    public double execute(final int index,
                          final double... vals) {
        ICalculatorCommand iCalculatorCommandLoc = this.commands.get(index - 1);
        return iCalculatorCommandLoc.execute(vals);
    }


}
