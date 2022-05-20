package com.java.design.patterns.behavioral.strategy;


public class WarRun {

    public static void main(final String[] args) {
        Soldier soldierLoc = new SoldierSlow(new NormalShooter());
        soldierLoc.shoot();
        soldierLoc.shoot();
        soldierLoc.shoot();
        soldierLoc.shoot();
        soldierLoc.march();
        soldierLoc.duck();


    }
}
