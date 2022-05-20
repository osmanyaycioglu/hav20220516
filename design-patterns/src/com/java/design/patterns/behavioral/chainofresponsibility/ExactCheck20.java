package com.java.design.patterns.behavioral.chainofresponsibility;


public class ExactCheck20 extends AbstractCheckNumber {

    public ExactCheck20(final ICheckNumber nextParam) {
        super(nextParam);
    }

    @Override
    public String check(final int input) {
        if (input == 20) {
            return "rakam 20";
        }
        return this.runNext(input);
    }

}
