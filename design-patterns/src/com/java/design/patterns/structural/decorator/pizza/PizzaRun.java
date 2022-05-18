package com.java.design.patterns.structural.decorator.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaRun {

    public static void main(final String[] args) {
        // Data yaklaşımı
        List<PizzaDecoratorData> datasLoc = new ArrayList<>();
        datasLoc.add(new PizzaDecoratorData(10,
                                            "Peynir"));
        datasLoc.add(new PizzaDecoratorData(5,
                                            "Misir"));
        datasLoc.add(new PizzaDecoratorData(15,
                                            "Sucuk"));
        int price = 0;
        String desc = "";
        for (PizzaDecoratorData pizzaDecoratorDataLoc : datasLoc) {
            price += pizzaDecoratorDataLoc.getPrice();
            desc += " " + pizzaDecoratorDataLoc.getDesc();
        }
        System.out.println(" Fiyat : " + price + " " + desc);

        // OO Yaklaşımı
        Pizza pizzaLoc = new DynamicPizzaDecorator(new DynamicPizzaDecorator(new DynamicPizzaDecorator(new Pizza(),
                                                                                                       new PizzaDecoratorData(10,
                                                                                                                              "Peynir")),
                                                                             new PizzaDecoratorData(5,
                                                                                                    "Misir")),
                                                   new PizzaDecoratorData(15,
                                                                          "Sucuk"));

        System.out.println(" Fiyat : " + pizzaLoc.getPrice() + " " + pizzaLoc.getDesc());
    }
}
