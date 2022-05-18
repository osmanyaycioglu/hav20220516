package com.java.design.patterns.structural.decorator.pizza;


public abstract class AbstractPizzaDecorator extends Pizza {

    private final Pizza pizza;

    public AbstractPizzaDecorator(final Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public Integer getPrice() {
        return this.pizza.getPrice()
               + this.getPizzaDecoratorData()
                     .getPrice();
    }


    @Override
    public String getDesc() {
        return this.pizza.getDesc()
               + " "
               + this.getPizzaDecoratorData()
                     .getDesc();
    }

    public abstract PizzaDecoratorData getPizzaDecoratorData();

}
