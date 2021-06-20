/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */

package me.khosraw;

import java.util.Arrays;

public class MultiplesOf {

    public static void main(String[] args) {
        int[] multiples = new int[0];

        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
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