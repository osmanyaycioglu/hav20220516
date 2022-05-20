package com.java.design.patterns.structural.bridge;


public class CatC implements IAnimal {

    @Override
    public void eat() {
        System.out.println("eating cat food");

    }

    @Override
    public void talk() {
        System.out.println("miyav");
    }

}
