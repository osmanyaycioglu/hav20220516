package com.java.design.patterns.lab.atmv2.atm.commands;

import java.util.Scanner;

import com.java.design.patterns.lab.atmv2.Customer;

public class ShowAccount implements IATMCommand {

    @Override
    public void executeCommand(final Customer customerParam,
                               final Scanner scannerParam) {
        System.out.println(customerParam.getAccountNumber()
                           + " nolu hesabınızda  "
                           + customerParam.getAmount()
                           + " TL para var");
    }

    @Override
    public String getDesc() {
        return "Hesabı görüntüle";
    }

}
