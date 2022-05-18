package com.java.design.patterns.lab.atmv3;


public class CustomerDAOFactory {

    public static ICustomerDAO createCustomerDAO() {
        // return new StaticCustomerDAO();
        return new FileReaderCustomerDAO();
    }

}
