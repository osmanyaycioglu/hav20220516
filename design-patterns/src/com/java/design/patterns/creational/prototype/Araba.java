package com.java.design.patterns.creational.prototype;


public class Araba {

    private String brand;
    private int    horsePower;
    private int    windowSize;
    private double xyz;
    private int    weight;
    private String dynamicVal1;
    private String dynamicVal2;

    //    public void syncXyz() {
    //        // WS den al
    //    }

    public int ileriGit() {
        return (int) (this.horsePower * this.getXyz());
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(final int horsePowerParam) {
        this.horsePower = horsePowerParam;
    }

    public int getWindowSize() {
        return this.windowSize;
    }

    public void setWindowSize(final int windowSizeParam) {
        this.windowSize = windowSizeParam;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(final int weightParam) {
        this.weight = weightParam;
    }


    public double getXyz() {
        return this.xyz;
    }


    public void setXyz(final double xyzParam) {
        this.xyz = xyzParam;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(final String brandParam) {
        this.brand = brandParam;
    }


    public String getDynamicVal1() {
        return this.dynamicVal1;
    }


    public void setDynamicVal1(final String dynamicVal1Param) {
        this.dynamicVal1 = dynamicVal1Param;
    }


    public String getDynamicVal2() {
        return this.dynamicVal2;
    }


    public void setDynamicVal2(final String dynamicVal2Param) {
        this.dynamicVal2 = dynamicVal2Param;
    }

    public Araba getClone() {
        Araba araba = new Araba();
        araba.setBrand(this.brand);
        araba.setHorsePower(this.horsePower);
        araba.setXyz(this.xyz);
        araba.setWindowSize(this.windowSize);
        araba.setWeight(this.weight);
        return araba;
    }

}
