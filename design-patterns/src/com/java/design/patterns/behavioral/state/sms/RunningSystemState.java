package com.java.design.patterns.behavioral.state.sms;


public class RunningSystemState implements ISystemState {

    @Override
    public ISystemState suspend() {
        return new SuspendSystemState();
    }

    @Override
    public ISystemState running() {
        return this;
    }

    @Override
    public ISystemState error() {
        return new ErrorSystemState();
    }

    @Override
    public void sendSms(final String destParam,
                        final String msgParam) {
        System.out.println("Sending sms to " + destParam + " message : " + msgParam);
    }

}
