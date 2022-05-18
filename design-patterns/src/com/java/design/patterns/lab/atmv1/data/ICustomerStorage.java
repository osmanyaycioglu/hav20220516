package com.java.design.patterns.lab.atmv1.data;

import com.java.design.patterns.lab.atmv1.models.Customer;

public interface ICustomerStorage {

    void init();

    Customer getCustomer(String username);

    void addCustomer(Customer customerParam);

}
