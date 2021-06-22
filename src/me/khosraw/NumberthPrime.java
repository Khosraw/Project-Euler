package me.khosraw;

import java.util.Arrays;

public class NumberthPrime {
    public static void main(String[] args) {
        int[] primes = new int[0];
        int i = 0;
        while (primes.length - 1 < 10001) {
            i = i + 1;
            int counter = 0;
            int num;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primes = Arrays.copyOf(primes, primes.length + 1);
                primes[primes.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(primes));

    }
}
