package com.java.design.patterns.lab.atmv2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerManager {

    private final Map<Long, Customer>       customerMap         = new HashMap<>();
    private final Map<String, Customer>     usernameCustomerMap = new HashMap<>();

    private volatile static CustomerManager instance;

    public static CustomerManager getInstance() {
        if (CustomerManager.instance == null) {
            synchronized (CustomerManager.class) {
                if (CustomerManager.instance == null) {
                    CustomerManager.instance = new CustomerManager();
                }
            }
        }
        return CustomerManager.instance;
    }

    private CustomerManager() {
        Path filePath = Paths.get("customer.txt");
        try {
            List<String> readAllLinesLoc = Files.readAllLines(filePath);
            for (String stringLoc : readAllLinesLoc) {
                String[] splitLoc = stringLoc.split(",");
                if (splitLoc.length == 7) {
                    Customer customerLoc = new Customer();
                    customerLoc.setAccountNumber(Long.parseLong(splitLoc[0]));
                    customerLoc.setAmount(Integer.parseInt(splitLoc[1]));
                    customerLoc.setName(splitLoc[2]);
                    customerLoc.setSurname(splitLoc[3]);
                    customerLoc.setUsername(splitLoc[4]);
                    customerLoc.setPassword(splitLoc[5]);
                    customerLoc.setCustomerType(ECustomerType.valueOf(splitLoc[6]));
                    this.customerMap.put(customerLoc.getAccountNumber(),
                                         customerLoc);
                    this.usernameCustomerMap.put(customerLoc.getUsername(),
                                                 customerLoc);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Customer getCustomerByAccountNumber(final Long accountNumber) {
        return this.customerMap.get(accountNumber);
    }

    public Customer login(final String username,
                          final String password) {
        Customer customerLoc = this.usernameCustomerMap.get(username);
        if (customerLoc == null) {
            return null;
        }
        if (password.equals(customerLoc.getPassword())) {
            return customerLoc;
        }
        return null;
    }
}

