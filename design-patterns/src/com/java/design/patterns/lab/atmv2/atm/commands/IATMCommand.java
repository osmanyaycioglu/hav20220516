package com.java.design.patterns.lab.atmv2.atm.commands;

import java.util.Scanner;

import com.java.design.patterns.lab.atmv2.Customer;

public interface IATMCommand {

    void executeCommand(Customer customerParam,
                        Scanner scannerParam);

    String getDesc();
}
