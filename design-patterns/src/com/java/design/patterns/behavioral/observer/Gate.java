package com.java.design.patterns.behavioral.observer;


public class Gate implements IAlarm {

    @Override
    public void alarmOn(final EAlarmType alarmTypeParam,
                        final String alarmDescParam,
                        final String alarmOrgParam) {
        if (alarmTypeParam == EAlarmType.THIEF) {

            System.out.println("Dış Kapı kilitli");
        } else {
            System.out.println("Dış Kapı kapıyı aç");
        }
    }

    @Override
    public void alarmOff(final EAlarmType alarmTypeParam,
                         final String alarmDescParam,
                         final String alarmOrgParam) {
        System.out.println("Dış Kapı kilitli kaldı");

    }

}
