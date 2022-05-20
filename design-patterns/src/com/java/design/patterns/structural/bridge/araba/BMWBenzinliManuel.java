package com.java.design.patterns.structural.bridge.araba;


public class BMWBenzinliManuel extends BMW {

    public BMWBenzinliManuel(final ITransmisyon transmisyonParam,
                             final IYakit yakitParam) {
        super(transmisyonParam,
              yakitParam);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void ileriGit() {
        System.out.println("Manuel Benzinli BMW ileri gidiyor");
    }

}
