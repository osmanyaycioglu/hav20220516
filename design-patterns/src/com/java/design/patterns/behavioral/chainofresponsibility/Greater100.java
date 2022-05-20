package com.java.design.patterns.behavioral.chainofresponsibility;


public class Greater100 extends AbstractCheckNumber {

    public Greater100(final ICheckNumber nextParam) {
        super(nextParam);
    }

    @Override
    public String check(final int input) {
        if (input >= 100) {
            return "100 den bütük";
        }
        return this.runNext(input);
    }

}
