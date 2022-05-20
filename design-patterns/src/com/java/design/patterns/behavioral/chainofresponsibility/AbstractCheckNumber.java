package com.java.design.patterns.behavioral.chainofresponsibility;


public abstract class AbstractCheckNumber implements ICheckNumber {

    private final ICheckNumber next;

    public AbstractCheckNumber(final ICheckNumber nextParam) {
        super();
        this.next = nextParam;
    }

    public String runNext(final int number) {
        if (this.next != null) {
            return this.next.check(number);
        }
        return null;
    }

}
