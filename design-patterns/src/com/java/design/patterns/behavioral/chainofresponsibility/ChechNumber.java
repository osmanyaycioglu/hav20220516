package com.java.design.patterns.behavioral.chainofresponsibility;

public class ChechNumber {

    public static void main(final String[] args) {
        int input = 100;
        if ((input > 0) && (input < 20)) {
            System.out.println("0 ile 20 arasında");
        } else if (input == 20) {
            System.out.println("20");
        } else if ((input > 20) && (input < 100)) {
            System.out.println("20 ile 100 arasında");
        } else if (input >= 100) {
            System.out.println("100 den büyük");
        } else {
            System.out.println("0 dan küçük");
        }

        ICheckNumber checkNumberLoc = new RangeCheck020(new ExactCheck20(new RangeCheck20100(new Greater100(new EndCheck(null)))));
        System.out.println(checkNumberLoc.check(input));
    }
}
