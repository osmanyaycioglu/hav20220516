package com.java.design.patterns.lab.atmv1.business;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

import com.java.design.patterns.lab.atmv1.common.IInputSource;
import com.java.design.patterns.lab.atmv1.models.Customer;

public class CustomerTaskImpl implements ICustomerProcess {

    private final Supplier<String>                   menuProvider;
    private final BiConsumer<Customer, IInputSource> customerTask;

    public CustomerTaskImpl(final Supplier<String> menuProviderParam,
                            final BiConsumer<Customer, IInputSource> customerTaskParam) {
        super();
        this.menuProvider = menuProviderParam;
        this.customerTask = customerTaskParam;
    }

    @Override
    public Supplier<String> menuProvider() {
        return this.menuProvider;
    }

    @Override
    public BiConsumer<Customer, IInputSource> customerTask() {
        return this.customerTask;
    }


}
