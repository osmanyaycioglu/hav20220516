package com.java.design.patterns.lab.atmv2.observer;

import com.java.design.patterns.lab.atmv2.Customer;

public interface ICommandRunInfo {

    void commandRun(String command,
                    Customer customer);
}
