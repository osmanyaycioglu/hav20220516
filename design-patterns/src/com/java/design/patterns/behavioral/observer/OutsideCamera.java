package com.java.design.patterns.behavioral.observer;


public class OutsideCamera implements IAlarm {

    @Override
    public void alarmOn(final EAlarmType alarmTypeParam,
                        final String alarmDescParam,
                        final String alarmOrgParam) {
        System.out.println("Outside Record başlatıldı");
    }

    @Override
    public void alarmOff(final EAlarmType alarmTypeParam,
                         final String alarmDescParam,
                         final String alarmOrgParam) {
        System.out.println("Outside Record durduruldu");

    }

}