package com.java.design.patterns.behavioral.command;


public class DivCommand implements ICalculatorCommand {

    @Override
    public double execute(final double... valsParam) {
        if (valsParam[1] == 0D) {
            return 0D;
        }
        return valsParam[0] / valsParam[1];
    }

    @Override
    public String getName() {
        return "Div";
    }

    @Override
    public int getInputParamCount() {
        return 2;
    }

}
