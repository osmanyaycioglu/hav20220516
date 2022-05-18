package com.java.design.patterns.structural.decorator;

import java.util.List;

public class PProcessorFactory {

    public static PProcessor createPProcessoressor(final List<Integer> listParam) {
        PProcessor pProcessorLoc = new PProcessor();
        for (Integer integerLoc : listParam) {
            switch (integerLoc) {
                case 0:
                    pProcessorLoc = new PProcessorSayinDecorator(pProcessorLoc);
                    break;
                case 1:
                    pProcessorLoc = new PProcessorSevgiliDecorator(pProcessorLoc);
                    break;
                case 2:
                    pProcessorLoc = new PProcessorEnSevDecorator(pProcessorLoc);
                    break;
                case 3:
                    pProcessorLoc = new PProcessorHazretleriDecorator(pProcessorLoc);
                    break;

                default:
                    break;
            }
        }
        return pProcessorLoc;
    }
}
