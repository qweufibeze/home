package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class MaxNumeralOfRandom {
    private static int num_rnd;

    public static void main(String[] args) {
        num_rnd = new java.util.Random().nextInt(900) + 100;
        System.out.println("Random number - " + num_rnd);
        System.out.println("Max numeral - " + getMaxNumeral(num_rnd));
    }

    public static int getMaxNumeral(int num) {
        ArrayList<Integer> arrOfNum = new ArrayList();

        for(int i = 0; i < 10; i++) {
            arrOfNum.add(num % 10);
            num /= 10;
        }

        return Collections.max(arrOfNum);
    }
}
