package com.java.design.patterns.structural.bridge.araba;


public class BMWDizelOtomatik extends BMW {

    public BMWDizelOtomatik(final ITransmisyon transmisyonParam,
                            final IYakit yakitParam) {
        super(transmisyonParam,
              yakitParam);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void ileriGit() {
        System.out.println("Otomatik Dizel BMW ileri gidiyor");
    }

}
