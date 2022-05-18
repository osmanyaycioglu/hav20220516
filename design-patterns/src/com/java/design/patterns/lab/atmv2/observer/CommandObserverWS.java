package com.java.design.patterns.lab.atmv2.observer;

import com.java.design.patterns.lab.atmv2.Customer;

public class CommandObserverWS implements ICommandRunInfo {

    @Override
    public void commandRun(final String commandParam,
                           final Customer customerParam) {
        System.out.println("WebService ile gönderiliyor : command  : " + commandParam + " " + customerParam);
    }

}
