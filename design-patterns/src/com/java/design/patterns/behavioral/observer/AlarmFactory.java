package com.java.design.patterns.behavioral.observer;


public class AlarmFactory {

    static {
        System.out.println("static çalıştı");
    }

    public static IAlarm createAlarm() {
        Alarm alarmLoc = new Alarm();
        alarmLoc.registerAlarmForThief(new Lights());
        alarmLoc.registerAlarmForThief(new Camera());
        alarmLoc.registerAlarmForThief(new Doors());
        alarmLoc.registerAlarmForThief(new Vantilator());
        alarmLoc.registerAlarmForThief(new OutsideCamera());
        alarmLoc.registerAlarmForThief(new Gate());

        alarmLoc.registerAlarmForFire(new Doors());
        alarmLoc.registerAlarmForFire(new Vantilator());
        alarmLoc.registerAlarmForFire(new OutsideCamera());
        alarmLoc.registerAlarmForFire(new Gate());

        return alarmLoc;
    }
}
