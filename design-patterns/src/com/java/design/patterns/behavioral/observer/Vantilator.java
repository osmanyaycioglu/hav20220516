package com.java.design.patterns.behavioral.observer;


public class Vantilator implements IAlarm {

    @Override
    public void alarmOn(final EAlarmType alarmTypeParam,
                        final String alarmDescParam,
                        final String alarmOrgParam) {
        System.out.println("Valitatör başlatıldı");
    }

    @Override
    public void alarmOff(final EAlarmType alarmTypeParam,
                         final String alarmDescParam,
                         final String alarmOrgParam) {
        System.out.println("Valitatör durduruldu");

    }

}
