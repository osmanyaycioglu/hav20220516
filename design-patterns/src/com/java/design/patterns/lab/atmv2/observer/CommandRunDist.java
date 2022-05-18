package com.java.design.patterns.lab.atmv2.observer;

import java.util.ArrayList;
import java.util.List;

import com.java.design.patterns.lab.atmv2.Customer;

public class CommandRunDist implements ICommandRunInfo {

    private final List<ICommandRunInfo> commandRunInfos = new ArrayList<>();

    public void register(final ICommandRunInfo commandRunInfoParam) {
        this.commandRunInfos.add(commandRunInfoParam);
    }

    @Override
    public void commandRun(final String commandParam,
                           final Customer customerParam) {
        for (ICommandRunInfo iCommandRunInfoLoc : this.commandRunInfos) {
            iCommandRunInfoLoc.commandRun(commandParam,
                                          customerParam);
        }

    }

}
