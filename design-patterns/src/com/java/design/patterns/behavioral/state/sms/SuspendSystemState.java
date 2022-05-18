package com.java.design.patterns.behavioral.state.sms;

import java.util.ArrayList;
import java.util.List;

public class SuspendSystemState implements ISystemState {

    private final List<SmsMessage> temp = new ArrayList<>();

    @Override
    public ISystemState suspend() {
        return this;
    }

    @Override
    public ISystemState running() {
        RunningSystemState runningSystemStateLoc = new RunningSystemState();
        for (SmsMessage smsMessageLoc : this.temp) {
            runningSystemStateLoc.sendSms(smsMessageLoc.getDest(),
                                          smsMessageLoc.getMessage());
        }
        return runningSystemStateLoc;
    }

    @Override
    public ISystemState error() {
        for (SmsMessage smsMessageLoc : this.temp) {
            System.out.println("İptal : " + smsMessageLoc);
        }
        return new ErrorSystemState();
    }

    @Override
    public void sendSms(final String destParam,
                        final String msgParam) {
        System.out.println("Backup sms to " + destParam + " message : " + msgParam);
        this.temp.add(new SmsMessage(destParam,
                                     msgParam));
    }

}
