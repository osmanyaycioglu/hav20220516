package com.java.design.patterns.structural.bridge.araba;


public class BMWDizelManuel extends BMW {

    public BMWDizelManuel(final ITransmisyon transmisyonParam,
                          final IYakit yakitParam) {
        super(transmisyonParam,
              yakitParam);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void ileriGit() {
        System.out.println("Manuel Dizel BMW ileri gidiyor");
    }

}
