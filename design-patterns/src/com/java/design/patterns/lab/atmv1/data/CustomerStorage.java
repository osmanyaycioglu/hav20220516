package com.java.design.patterns.lab.atmv1.data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.java.design.patterns.lab.atmv1.models.Customer;

public class CustomerStorage implements ICustomerStorage {

    private final Map<String, Customer> mapLoc = new ConcurrentHashMap<>();

    @Override
    public void init() {
    }

    @Override
    public Customer getCustomer(final String usernameParam) {
        return this.mapLoc.get(usernameParam);
    }

    @Override
    public void addCustomer(final Customer customerParam) {
        if (this.mapLoc.containsKey(customerParam.getUsername())) {
            throw new IllegalArgumentException("Bu kullanıcı şu anda var");
        }
        this.mapLoc.put(customerParam.getUsername(),
                        customerParam);

    }
}
