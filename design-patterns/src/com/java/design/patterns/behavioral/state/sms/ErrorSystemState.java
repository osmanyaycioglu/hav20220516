package com.java.design.patterns.behavioral.state.sms;


public class ErrorSystemState implements ISystemState {

    @Override
    public ISystemState suspend() {
        return new SuspendSystemState();
    }

    @Override
    public ISystemState running() {
        return new RunningSystemState();
    }

    @Override
    public ISystemState error() {
        return this;
    }

    @Override
    public void sendSms(final String destParam,
                        final String msgParam) {
        System.out.println("Can not send sms to " + destParam + " message : " + msgParam);
    }

}
