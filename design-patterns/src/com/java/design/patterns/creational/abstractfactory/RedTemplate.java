package com.java.design.patterns.creational.abstractfactory;


public class RedTemplate implements IUITemplate {

    @Override
    public IButton createButton() {
        return new RedButton();
    }

    @Override
    public IText createText() {
        return new RedText();
    }

}
