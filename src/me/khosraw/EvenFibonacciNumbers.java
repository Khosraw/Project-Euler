package me.khosraw;

import java.util.Arrays;

public class EvenFibonacciNumbers {
    public static void main (String[] args) {
        int[] fibo = new int[0];

        for (int i = 0; i <= 4000000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                fibo = Arrays.copyOf(fibo, fibo.length + 1);
                fibo[fibo.length - 1] = i;
            }
        }

    }
}
