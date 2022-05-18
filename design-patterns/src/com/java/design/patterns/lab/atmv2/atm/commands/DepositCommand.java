package com.java.design.patterns.lab.atmv2.atm.commands;

import java.util.Scanner;

import com.java.design.patterns.lab.atmv2.Customer;

public class DepositCommand implements IATMCommand {

    @Override
    public void executeCommand(final Customer customerParam,
                               final Scanner scannerParam) {
        System.out.println("Yatıracağınız miktar : ");
        int nextIntLoc = scannerParam.nextInt();
        customerParam.setAmount(customerParam.getAmount() + nextIntLoc);
    }

    @Override
    public String getDesc() {
        return "Para yatır";
    }

}
