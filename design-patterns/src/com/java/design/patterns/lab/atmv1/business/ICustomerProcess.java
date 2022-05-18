package com.java.design.patterns.lab.atmv1.business;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

import com.java.design.patterns.lab.atmv1.common.IInputSource;
import com.java.design.patterns.lab.atmv1.models.Customer;

public interface ICustomerProcess {

    Supplier<String> menuProvider();

    BiConsumer<Customer, IInputSource> customerTask();

}
