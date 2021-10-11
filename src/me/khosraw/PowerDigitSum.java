package me.khosraw;

import java.math.BigInteger;

public class PowerDigitSum {
    public static void main (String[] args) {
        BigInteger num = new BigInteger("2");
        num = num.pow(1000);
        int sum = 0;

        String[] arr = num.toString().split("");

        for (String a : arr) {
            sum = sum + Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
