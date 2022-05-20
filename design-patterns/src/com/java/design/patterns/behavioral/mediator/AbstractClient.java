package com.java.design.patterns.behavioral.mediator;


public abstract class AbstractClient implements IMsgListener {

    protected Mediator mediator;

    public AbstractClient(final Mediator mediatorParam) {
        super();
        this.mediator = mediatorParam;
        this.mediator.register(this);
    }


}
