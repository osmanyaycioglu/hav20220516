package com.java.design.patterns.behavioral.chainofresponsibility;


public class EndCheck extends AbstractCheckNumber {

    public EndCheck(final ICheckNumber nextParam) {
        super(nextParam);
    }

    @Override
    public String check(final int input) {
        return "0 den küçük";
    }

}
