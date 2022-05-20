package com.java.design.patterns.creational.abstractfactory;


public class TextFactory {

    public static IText createButton(final int type) {
        switch (type) {
            case 1:
                return new RedText();
            case 2:
                return new BlueText();

            default:
                return new RedText();
        }

    }

}
