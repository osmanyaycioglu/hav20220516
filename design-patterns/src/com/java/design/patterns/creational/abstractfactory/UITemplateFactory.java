package com.java.design.patterns.creational.abstractfactory;


public class UITemplateFactory {

    public static IUITemplate createTemplate(final int index) {
        switch (index) {
            case 1:
                return new RedTemplate();
            case 2:
                return new BlueTemplate();
            case 3:
                return new GreenTemplate();

            default:
                return new RedTemplate();
        }
    }
}
