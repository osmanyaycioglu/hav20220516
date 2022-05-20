package com.java.design.patterns.creational.abstractfactory;


public class AbstractFactoryRun {

    public static void main(final String[] args) {
        IButton buttonLoc = ButtonFactory.createButton(1);
        IText textLoc = TextFactory.createButton(1);

        IUITemplate templateLoc = UITemplateFactory.createTemplate(2);
        IButton createButtonLoc = templateLoc.createButton();
        IText createTextLoc = templateLoc.createText();

    }
}
