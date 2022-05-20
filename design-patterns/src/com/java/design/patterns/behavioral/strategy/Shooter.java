package com.java.design.patterns.behavioral.strategy;

import java.util.Random;

public abstract class Shooter implements IShoot {

    private final Random randomLoc = new Random();
    private final int    limit;


    public Shooter(final int limitParam) {
        super();
        this.limit = limitParam;
    }


    @Override
    public void shoot() {
        if (this.randomLoc.nextInt(100) > this.limit) {
            System.out.println("vurdum");
        } else {
            System.out.println("vuramadım");
        }

    }

}
