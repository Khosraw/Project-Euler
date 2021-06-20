package me.khosraw;

import java.util.Arrays;

public class LargestPrimeFactor {
    public static void main (String[] args) {
        int[] multiples = new int[0];

        for (int i = 0; i <= 1000; i++) {
            if (i % ) {
                multiples = Arrays.copyOf(multiples, multiples.length + 1);
                multiples[multiples.length - 1] = i;
            }
        }
        int result = 0;
        for (int i = 0; i < 467; i++) {
            result = result + multiples[i];
        }

        System.out.println(result);

    }
}
