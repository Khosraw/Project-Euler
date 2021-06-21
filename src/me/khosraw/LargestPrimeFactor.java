package me.khosraw;

import java.util.Arrays;

public class LargestPrimeFactor {
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
        long num = 600851475143L;
        long largestFactor = 0;

        long[] primeFactors = new long[0];

        for (int factor = 2; factor <= 600851475143L; factor++) {
            if (600851475143L % i == 0 && Long.parseLong("600851475143") % 2 != 0 && Long.parseLong("600851475143") % 3 != 0) {
                primeFactors = Arrays.copyOf(primeFactors, primeFactors.length + 1);
                primeFactors[primeFactors.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(factors));

    }
}
