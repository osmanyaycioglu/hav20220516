package com.java.design.patterns.structural.bridge.araba;


public class BMW2 {


    private final String transmisyonType;
    private final String yakitType;

    public BMW2(final String transmisyonType,
                final String yakitType) {
        this.transmisyonType = transmisyonType;
        this.yakitType = yakitType;
    }

    public void ileriGit() {
        switch (this.transmisyonType) {
            case "otomatik":
                switch (this.yakitType) {
                    case "dizel":

                        break;
                    case "benzinli":

                        break;

                    default:
                        break;
                }
                break;
            case "manuel":
                switch (this.yakitType) {
                    case "dizel":

                        break;
                    case "benzinli":

                        break;

                    default:
                        break;
                }
                break;

            default:
                break;
        }
        System.out.println("BMW ileri gidiyor");
    }

}
