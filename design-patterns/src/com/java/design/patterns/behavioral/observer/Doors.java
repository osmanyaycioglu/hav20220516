package com.java.design.patterns.behavioral.observer;


public class Doors implements IAlarm {

    @Override
    public void alarmOn(final EAlarmType alarmTypeParam,
                        final String alarmDescParam,
                        final String alarmOrgParam) {
        System.out.println("Kapılar açıldı");
    }

    @Override
    public void alarmOff(final EAlarmType alarmTypeParam,
                         final String alarmDescParam,
                         final String alarmOrgParam) {
        System.out.println("Kapılar açık bırakıldı");

    }

}
