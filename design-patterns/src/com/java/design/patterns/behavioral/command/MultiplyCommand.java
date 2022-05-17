package com.java.design.patterns.behavioral.command;


public class MultiplyCommand implements ICalculatorCommand {

    @Override
    public double execute(final double... valsParam) {
        double total = 1D;
        for (double dLoc : valsParam) {
            total *= dLoc;
        }
        return total;
    }

    @Override
    public String getName() {
        return "Multiply";
    }

    @Override
    public int getInputParamCount() {
        return 2;
    }


}
