package com.java.design.patterns.lab.atmv2.atm.commands;

import java.util.Scanner;

import com.java.design.patterns.lab.atmv2.Customer;
import com.java.design.patterns.lab.atmv2.CustomerManager;

public class TransferCommand implements IATMCommand {

    @Override
    public void executeCommand(final Customer customerParam,
                               final Scanner scannerParam) {
        System.out.println("Para göndereceğiniz hesap no : ");
        Long accountNumber = scannerParam.nextLong();
        Customer toCustomerLoc = CustomerManager.getInstance()
                                                .getCustomerByAccountNumber(accountNumber);
        if (toCustomerLoc == null) {
            System.out.println("Böyle bir hesap bulunmuyor");
            return;
        }
        System.out.println("Göndereceğiniz miktar : ");
        int nextIntLoc = scannerParam.nextInt();
        if (nextIntLoc > customerParam.getAmount()) {
            System.out.println("hesabınızdaki paradan daha fazla çekemezsiniz");
            return;
        }
        customerParam.setAmount(customerParam.getAmount() - nextIntLoc);
        toCustomerLoc.setAmount(toCustomerLoc.getAmount() + nextIntLoc);
        System.out.println("para transferiniz başarı ile tamamlandı");
    }

    @Override
    public String getDesc() {
        return "Para transferi";
    }

}
