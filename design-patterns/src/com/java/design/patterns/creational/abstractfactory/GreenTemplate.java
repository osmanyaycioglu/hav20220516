package com.java.design.patterns.creational.abstractfactory;


public class GreenTemplate implements IUITemplate {

    @Override
    public IButton createButton() {
        return new BlueButton();
    }

    @Override
    public IText createText() {
        return new BlueText();
    }

}
