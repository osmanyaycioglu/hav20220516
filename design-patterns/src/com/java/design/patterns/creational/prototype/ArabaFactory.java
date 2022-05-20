package com.java.design.patterns.creational.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ArabaFactory {

    private static Map<String, Araba> arabaMap = new ConcurrentHashMap<>();

    public static Araba createAraba(final String brand) {
        Araba arabaLoc = ArabaFactory.arabaMap.get(brand);
        if (arabaLoc != null) {
            return arabaLoc.getClone();
        } else {
            // db den al
            Araba araba = new Araba();
            araba.setBrand(brand);
            araba.setHorsePower(108);
            araba.setXyz(10D);
            araba.setWindowSize(4);
            araba.setWeight(1900);
            ArabaFactory.arabaMap.put(brand,
                                      araba);
            return araba;
        }
    }

}
