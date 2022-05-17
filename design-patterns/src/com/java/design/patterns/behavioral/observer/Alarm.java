package com.java.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Alarm implements IAlarm {

    private final List<IAlarm> thiefAlarmActions = new ArrayList<>();
    private final List<IAlarm> fireAlarmActions  = new ArrayList<>();


    public void registerAlarmForThief(final IAlarm alarmParam) {
        this.thiefAlarmActions.add(alarmParam);
    }

    public void registerAlarmForFire(final IAlarm alarmParam) {
        this.fireAlarmActions.add(alarmParam);
    }

    @Override
    public void alarmOn(final EAlarmType alarmTypeParam,
                        final String alarmDescParam,
                        final String alarmOrgParam) {
        if (alarmTypeParam == EAlarmType.THIEF) {
            for (IAlarm iAlarmLoc : this.thiefAlarmActions) {
                iAlarmLoc.alarmOn(alarmTypeParam,
                                  alarmDescParam,
                                  alarmOrgParam);
            }
        } else {
            for (IAlarm iAlarmLoc : this.fireAlarmActions) {
                iAlarmLoc.alarmOn(alarmTypeParam,
                                  alarmDescParam,
                                  alarmOrgParam);
            }

        }
    }

    @Override
    public void alarmOff(final EAlarmType alarmTypeParam,
                         final String alarmDescParam,
                         final String alarmOrgParam) {
        if (alarmTypeParam == EAlarmType.THIEF) {
            for (IAlarm iAlarmLoc : this.thiefAlarmActions) {
                iAlarmLoc.alarmOff(alarmTypeParam,
                                   alarmDescParam,
                                   alarmOrgParam);
            }
        } else {
            for (IAlarm iAlarmLoc : this.fireAlarmActions) {
                iAlarmLoc.alarmOff(alarmTypeParam,
                                   alarmDescParam,
                                   alarmOrgParam);
            }

        }

    }

}
