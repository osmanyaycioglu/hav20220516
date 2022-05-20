package com.java.design.patterns.behavioral.strategy;

import java.util.Random;

public class Soldier {

    private final IShoot shoot;

    public Soldier(final IShoot shootParam) {
        super();
        this.shoot = shootParam;
    }

    public void shoot() {
        this.shoot.shoot();
    }

    public void march() {
        System.out.println("saatte 10 km ileri");
    }

    public void duck() {
        Random randomLoc = new Random();
        if (randomLoc.nextInt(100) > 50) {
            System.out.println("vuruldum");
        } else {
            System.out.println("kaçtım");
        }
    }


}
