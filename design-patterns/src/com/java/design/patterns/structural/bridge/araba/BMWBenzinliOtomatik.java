package com.java.design.patterns.structural.bridge.araba;


public class BMWBenzinliOtomatik extends BMW {

    public BMWBenzinliOtomatik(final ITransmisyon transmisyonParam,
                               final IYakit yakitParam) {
        super(transmisyonParam,
              yakitParam);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void ileriGit() {
        System.out.println("Otomatik Benzinli BMW ileri gidiyor");
    }

}
