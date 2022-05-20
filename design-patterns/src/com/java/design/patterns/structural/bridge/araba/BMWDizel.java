package com.java.design.patterns.structural.bridge.araba;


public class BMWDizel extends BMW {

    public BMWDizel(final ITransmisyon transmisyonParam,
                    final IYakit yakitParam) {
        super(transmisyonParam,
              yakitParam);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void ileriGit() {
        System.out.println("Dizel BMW ileri gidiyor");
    }

}
