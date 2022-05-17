package com.java.design.patterns.behavioral.command;


public class TripleAddCommand extends AddCommand {

    @Override
    public String getName() {
        return "Triple Add";
    }

    @Override
    public int getInputParamCount() {
        return 3;
    }


}
