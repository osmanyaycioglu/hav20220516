package com.java.design.patterns.creational.abstractfactory;


public class ButtonFactory {

    public static IButton createButton(final int type) {
        switch (type) {
            case 1:
                return new RedButton();
            case 2:
                return new BlueButton();
            case 3:
                return new BlueButton();
            default:
                return new RedButton();
        }

    }

}
