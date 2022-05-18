package com.java.design.patterns.lab.atmv1;

import java.util.Scanner;

import com.java.design.patterns.lab.atmv1.common.IInputSource;
import com.java.design.patterns.lab.atmv1.common.IOutputSource;
import com.java.design.patterns.lab.atmv1.common.InputSourceImpl;
import com.java.design.patterns.lab.atmv1.common.OutputSourceImpl;
import com.java.design.patterns.lab.atmv1.data.CustomerStorage;
import com.java.design.patterns.lab.atmv1.models.Customer;

public class RunAtm {

    public static void main(final String[] args) {
        CustomerStorage customerStorageLoc = new CustomerStorage();
        customerStorageLoc.addCustomer(new Customer().setUsername("osmany")
                                                     .setName("osman")
                                                     .setSurname("yaycıoğlu")
                                                     .setAmount(1000)
                                                     .setPassword("1234"));
        try (Scanner scannerLoc = new Scanner(System.in)) {
            IInputSource inputSourceLoc = new InputSourceImpl(scannerLoc);
            IOutputSource outputSourceLoc = new OutputSourceImpl();
            Atm atmLoc = new Atm(customerStorageLoc,
                                 inputSourceLoc,
                                 outputSourceLoc);
            atmLoc.start();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
