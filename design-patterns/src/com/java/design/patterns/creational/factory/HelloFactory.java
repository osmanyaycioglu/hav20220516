package com.java.design.patterns.creational.factory;


public class HelloFactory {

    private static final int LANGUAGE_ENG = 1;
    private static final int LANGUAGE_TR  = 2;

    public static void showMenu() {
        System.out.println(HelloFactory.LANGUAGE_ENG + "-English");
        System.out.println(HelloFactory.LANGUAGE_TR + "-Turkish");
        System.out.println("3-Spanish");
        System.out.println("4-Japanese");
    }

    public static IHello createHello(final int indexLoc) {
        IHello engLoc = null;
        switch (indexLoc) {
            case LANGUAGE_ENG:
                engLoc = new HelloEng();
                break;
            case LANGUAGE_TR:
                engLoc = new HelloTr();
                break;
            case 3:
                engLoc = new HelloEsp();
                break;
            case 4:
                engLoc = new HelloJp();
                break;
            default:
                engLoc = new HelloEng();
                break;
        }
        return engLoc;
    }
}
