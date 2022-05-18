package com.java.design.patterns.structural.decorator.pizza;


public class PizzaDecoratorData {

    private Integer price;
    private String  desc;


    public PizzaDecoratorData(final Integer priceParam,
                              final String descParam) {
        super();
        this.price = priceParam;
        this.desc = descParam;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(final Integer priceParam) {
        this.price = priceParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }


}
