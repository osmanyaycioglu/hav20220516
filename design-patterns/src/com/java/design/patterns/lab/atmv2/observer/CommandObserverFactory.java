package com.java.design.patterns.lab.atmv2.observer;


public class CommandObserverFactory {

    public static CommandRunDist getObservers() {
        CommandRunDist distLoc = new CommandRunDist();
        distLoc.register(new CommandObserverLog());
        distLoc.register(new CommandObserverDb());
        distLoc.register(new CommandObserverWS());
        return distLoc;
    }
}
