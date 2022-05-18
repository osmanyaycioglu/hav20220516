package com.java.design.patterns.lab.atmv2;

import java.util.ArrayList;
import java.util.List;

import com.java.design.patterns.lab.atmv2.atm.commands.DepositCommand;
import com.java.design.patterns.lab.atmv2.atm.commands.IATMCommand;
import com.java.design.patterns.lab.atmv2.atm.commands.ShowAccount;
import com.java.design.patterns.lab.atmv2.atm.commands.TransferCommand;
import com.java.design.patterns.lab.atmv2.atm.commands.WithdrawCommand;

public class ATMCommandFactory {

    public static List<IATMCommand> getATMCommandsForCustomer(final Customer customerParam) {
        List<IATMCommand> commandsLoc = new ArrayList<>();
        switch (customerParam.getCustomerType()) {
            case PLANTINUIM:
                commandsLoc.add(new TransferCommand());
                commandsLoc.add(new WithdrawCommand());
            case GOLD:
                commandsLoc.add(new DepositCommand());
            case SILVER:
            default:
                commandsLoc.add(new ShowAccount());
                break;
        }
        return commandsLoc;
    }
}
