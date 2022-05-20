package com.java.design.patterns.structural.bridge.araba;


public class Araba {

    private final ITransmisyon transmisyon;
    private final IYakit       yakit;


    public Araba(final ITransmisyon transmisyonParam,
                 final IYakit yakitParam) {
        super();
        this.transmisyon = transmisyonParam;
        this.yakit = yakitParam;
    }


    public void ileriGit() {
        System.out.println(this.transmisyon.name() + " " + this.yakit.name() + " Araba ileri gidiyor");
    }

}
