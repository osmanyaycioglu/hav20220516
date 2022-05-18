package com.java.design.patterns.lab.atmv2.atm.commands;

import java.util.Scanner;

import com.java.design.patterns.lab.atmv2.Customer;

public class WithdrawCommand implements IATMCommand {

    @Override
    public void executeCommand(final Customer customerParam,
                               final Scanner scannerParam) {
        System.out.println("Çekeceğiniz miktar : ");
        int nextIntLoc = scannerParam.nextInt();
        if (nextIntLoc > customerParam.getAmount()) {
            System.out.println("hesabınızdaki paradan daha fazla çekemezsiniz");
            return;
        }
        customerParam.setAmount(customerParam.getAmount() - nextIntLoc);
    }

    @Override
    public String getDesc() {
        return "Para çek";
    }

}
