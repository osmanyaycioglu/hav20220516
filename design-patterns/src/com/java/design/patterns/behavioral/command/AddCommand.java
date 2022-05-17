package com.java.design.patterns.behavioral.command;


public class AddCommand implements ICalculatorCommand {

    @Override
    public double execute(final double... valsParam) {
        double total = 0D;
        for (double dLoc : valsParam) {
            total += dLoc;
        }
        return total;
    }

    @Override
    public String getName() {
        return "Add";
    }

    @Override
    public int getInputParamCount() {
        return 2;
    }


}
