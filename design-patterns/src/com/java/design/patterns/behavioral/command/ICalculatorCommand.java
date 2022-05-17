package com.java.design.patterns.behavioral.command;


public interface ICalculatorCommand {

    String getName();

    double execute(final double... vals);

    int getInputParamCount();
}
