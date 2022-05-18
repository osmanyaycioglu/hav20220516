package com.java.design.patterns.lab.atmv1.business;

import com.java.design.patterns.lab.atmv1.common.IInputSource;
import com.java.design.patterns.lab.atmv1.models.Customer;

@FunctionalInterface
public interface ICustomerTask {

    void execute(Customer customerParam,
                 IInputSource scannerParam);
}
