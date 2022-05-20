package com.java.design.patterns.creational.abstractfactory;


public class BlueTemplate implements IUITemplate {

    @Override
    public IButton createButton() {
        return new BlueButton();
    }

    @Override
    public IText createText() {
        return new BlueText();
    }

}
