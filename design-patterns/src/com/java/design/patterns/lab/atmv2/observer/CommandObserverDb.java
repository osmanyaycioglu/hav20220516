package com.java.design.patterns.lab.atmv2.observer;

import com.java.design.patterns.lab.atmv2.Customer;

public class CommandObserverDb implements ICommandRunInfo {

    @Override
    public void commandRun(final String commandParam,
                           final Customer customerParam) {
        System.out.println("BD ye yazılıyor : command  : " + commandParam + " " + customerParam);
    }

}
