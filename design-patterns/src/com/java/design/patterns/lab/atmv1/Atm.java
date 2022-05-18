package com.java.design.patterns.lab.atmv1;

import java.util.List;

import com.java.design.patterns.lab.atmv1.business.CustomerManager;
import com.java.design.patterns.lab.atmv1.business.ICustomerProcess;
import com.java.design.patterns.lab.atmv1.common.IInputSource;
import com.java.design.patterns.lab.atmv1.common.IOutputSource;
import com.java.design.patterns.lab.atmv1.common.LoginException;
import com.java.design.patterns.lab.atmv1.data.CustomerStorage;
import com.java.design.patterns.lab.atmv1.data.ICustomerStorage;
import com.java.design.patterns.lab.atmv1.models.Customer;

public class Atm {

    ICustomerStorage                     customerStorageLoc = new CustomerStorage();
    CustomerManager                      customerManagerLoc;
    private final IOutputSource          outputSource;
    private final IInputSource           inputSource;
    private final List<ICustomerProcess> customerProcessesLoc;


    public Atm(final ICustomerStorage customerStorageLocParam,
               final IInputSource inputSourceParam,
               final IOutputSource outputSourceParam) {
        super();
        this.customerStorageLoc = customerStorageLocParam;
        this.inputSource = inputSourceParam;
        this.outputSource = outputSourceParam;
        this.customerManagerLoc = new CustomerManager(this.customerStorageLoc);
        this.customerProcessesLoc = this.customerManagerLoc.getCustomerProcesses();
    }

    public void start() {
        this.outputSource.writeLine("Bankamıza hoş geldiniz");
        root:
        while (true) {
            this.outputSource.writeLine("username:");
            String username = this.inputSource.nextString();
            this.outputSource.writeLine("password:");
            String password = this.inputSource.nextString();
            Customer customerLoc = null;
            try {
                customerLoc = this.customerManagerLoc.login(username,
                                                            password);
            } catch (LoginException eLoc) {
                System.out.println(eLoc.getMessage());
                continue root;
            }
            menu:
            while (true) {
                System.out.println(customerLoc.getName() + " " + customerLoc.getSurname() + " hoş geldiniz.");
                int i = 0;
                for (i = 0; i < this.customerProcessesLoc.size(); i++) {
                    ICustomerProcess cpLoc = this.customerProcessesLoc.get(i);
                    System.out.println((i + 1)
                                       + "-"
                                       + cpLoc.menuProvider()
                                              .get());
                }
                System.out.println(++i + "-Çıkış");
                System.out.println("seçiminiz : ");
                int nextIntLoc = this.inputSource.nextInt();
                if (nextIntLoc > this.customerProcessesLoc.size()) {
                    break root;
                }
                ICustomerProcess iCustomerProcessLoc = this.customerProcessesLoc.get(nextIntLoc - 1);
                this.customerManagerLoc.executeProcess(iCustomerProcessLoc,
                                                       customerLoc,
                                                       this.inputSource);
            }
        }

    }


}
