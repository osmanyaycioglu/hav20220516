package com.java.design.patterns.lab.atmv2;


public class Customer {

    private Long          accountNumber;
    private int           amount;
    private String        name;
    private String        surname;
    private String        username;
    private String        password;
    private ECustomerType customerType;

    public Long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(final Long accountNumberParam) {
        this.accountNumber = accountNumberParam;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(final int amountParam) {
        this.amount = amountParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public ECustomerType getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(final ECustomerType customerTypeParam) {
        this.customerType = customerTypeParam;
    }

    @Override
    public String toString() {
        return "Customer [accountNumber="
               + this.accountNumber
               + ", amount="
               + this.amount
               + ", name="
               + this.name
               + ", surname="
               + this.surname
               + ", username="
               + this.username
               + ", password="
               + this.password
               + ", customerType="
               + this.customerType
               + "]";
    }


}
