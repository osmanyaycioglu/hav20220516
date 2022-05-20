package com.java.design.patterns.behavioral.strategy;

public class SoldierSlow extends Soldier {

    public SoldierSlow(final IShoot shootParam) {
        super(shootParam);
    }

    @Override
    public void march() {
        System.out.println("saatte 5 km ileri");
    }


}
