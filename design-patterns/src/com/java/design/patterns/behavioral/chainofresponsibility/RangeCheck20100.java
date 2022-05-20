package com.java.design.patterns.behavioral.chainofresponsibility;


public class RangeCheck20100 extends AbstractCheckNumber {

    public RangeCheck20100(final ICheckNumber nextParam) {
        super(nextParam);
    }

    @Override
    public String check(final int input) {
        if ((input > 20) && (input < 100)) {
            return "20 ile 100 arasında";
        }
        return this.runNext(input);
    }

}
