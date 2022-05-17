package com.java.design.patterns.behavioral.command;


public class LogCommand implements ICalculatorCommand {

    @Override
    public double execute(final double... valsParam) {
        return Math.log(valsParam[0]);
    }

    @Override
    public String getName() {
        return "Log";
    }

    @Override
    public int getInputParamCount() {
        return 1;
    }

}
