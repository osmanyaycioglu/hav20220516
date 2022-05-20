package com.java.design.patterns.behavioral.interceptor;


public class DfAltCommand implements IInterceptor {

    @Override
    public void intercept(final String strParam) {
        System.out.println("DfAltCommand Parametre : " + strParam);

    }

    @Override
    public String getCommandStr() {
        return "df";
    }

}
