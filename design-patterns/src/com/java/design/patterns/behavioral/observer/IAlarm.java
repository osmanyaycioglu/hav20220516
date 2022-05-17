package com.java.design.patterns.behavioral.observer;


public interface IAlarm {

    void alarmOn(EAlarmType alarmTypeParam,
                 String alarmDesc,
                 String alarmOrg);

    void alarmOff(EAlarmType alarmTypeParam,
                  String alarmDesc,
                  String alarmOrg);

}
