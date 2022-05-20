package com.java.design.patterns.structural.bridge.araba;


public class BMW extends Araba {


    public BMW(final ITransmisyon transmisyonParam,
               final IYakit yakitParam) {
        super(transmisyonParam,
              yakitParam);
    }


}
