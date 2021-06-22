package me.khosraw;

import java.util.Arrays;

public class NumberthPrime {
    public static boolean isPrime (long n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if ((n % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main (String[] args) {
        int[] primes = new int[0];

        for (int i = 1; i <= 1000000000; i++) {
            if (1000000000 % i == 0) {
                primes = Arrays.copyOf(primes, primes.length + 1);
                primes[primes.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(primes));

    }
}
