package com.java.design.patterns.creational.abstractfactory;


public interface IUITemplate {

    IButton createButton();

    IText createText();
}
