package com.java.design.patterns.behavioral.observer;


public class AlarmRun {

    public static void main(final String[] args) {
        System.out.println("Başladım");
        IAlarm alarmLoc = AlarmFactory.createAlarm();
        alarmLoc.alarmOn(EAlarmType.THIEF,
                         "Hırsız alarmı",
                         "window");
        System.out.println("------------");
        alarmLoc.alarmOff(EAlarmType.THIEF,
                          "Hırsız alarmı",
                          "window");
        System.out.println("------***********------");
        alarmLoc.alarmOn(EAlarmType.FIRE,
                         "Hırsız alarmı",
                         "window");
        System.out.println("------------");
        alarmLoc.alarmOff(EAlarmType.FIRE,
                          "Hırsız alarmı",
                          "window");

        // Git ışıkları aç
        // Kameraya git record et
        // Kapıları aç
        // Dış kameraları aç
        // Dış kapıyı kitle
    }
}
