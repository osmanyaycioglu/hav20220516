package com.java.design.patterns.behavioral.chainofresponsibility;


public class RangeCheck020 extends AbstractCheckNumber {

    public RangeCheck020(final ICheckNumber nextParam) {
        super(nextParam);
    }

    @Override
    public String check(final int input) {
        if ((input > 0) && (input < 20)) {
            return "0 ile 20 arasında";
        }
        return this.runNext(input);
    }

}
