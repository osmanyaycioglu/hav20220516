package com.java.design.patterns.structural.decorator.pizza;


public class DynamicPizzaDecorator extends AbstractPizzaDecorator {

    private PizzaDecoratorData decoratorData;

    public DynamicPizzaDecorator(final Pizza pizza,
                                 final PizzaDecoratorData decoratorData) {
        super(pizza);
        this.decoratorData = decoratorData;
    }

    @Override
    public PizzaDecoratorData getPizzaDecoratorData() {
        return this.decoratorData;
    }

    public void setDecoratorData(final PizzaDecoratorData decoratorDataParam) {
        this.decoratorData = decoratorDataParam;
    }

}
