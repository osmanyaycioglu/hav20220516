package com.java.design.patterns.behavioral.state.sms;


public interface ISystemState {

    ISystemState suspend();

    ISystemState running();

    ISystemState error();

    void sendSms(String dest,
                 String msg);
}
