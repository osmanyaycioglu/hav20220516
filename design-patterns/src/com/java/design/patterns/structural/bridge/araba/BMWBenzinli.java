package com.java.design.patterns.structural.bridge.araba;


public class BMWBenzinli extends BMW {

    public BMWBenzinli(final ITransmisyon transmisyonParam,
                       final IYakit yakitParam) {
        super(transmisyonParam,
              yakitParam);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void ileriGit() {
        System.out.println("Benzinli BMW ileri gidiyor");
    }

}
