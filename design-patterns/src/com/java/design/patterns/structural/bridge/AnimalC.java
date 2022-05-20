package com.java.design.patterns.structural.bridge;


public class AnimalC {

    private final IAnimal animal;

    public AnimalC(final IAnimal animalParam) {
        super();
        this.animal = animalParam;
    }

    public void eat() {
        this.animal.eat();
    }

    public void talk() {
        this.animal.talk();
    }


}
