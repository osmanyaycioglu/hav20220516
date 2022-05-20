package com.java.design.patterns.behavioral.strategy;

public class SoldierFast extends Soldier {

    public SoldierFast(final IShoot shootParam) {
        super(shootParam);
    }

    @Override
    public void march() {
        System.out.println("saatte 15 km ileri");
    }


}
