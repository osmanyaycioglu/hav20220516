package com.java.design.patterns.behavioral.state.sms;


public class SystemState implements ISystemState {

    private ISystemState state = new RunningSystemState();

    @Override
    public ISystemState suspend() {
        this.state = this.state.suspend();
        return this.state;
    }

    @Override
    public ISystemState running() {
        this.state = this.state.running();
        return this.state;
    }

    @Override
    public ISystemState error() {
        this.state = this.state.error();
        return this.state;
    }

    @Override
    public void sendSms(final String destParam,
                        final String msgParam) {
        this.state.sendSms(destParam,
                           msgParam);
    }

}
