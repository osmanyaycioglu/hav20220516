package com.java.design.patterns.behavioral.command;


public class SubsCommand implements ICalculatorCommand {

    @Override
    public double execute(final double... valsParam) {
        return valsParam[0] - valsParam[1];
    }

    @Override
    public String getName() {
        return "Subs";
    }

    @Override
    public int getInputParamCount() {
        return 2;
    }

}
