package me.khosraw;

import java.util.Arrays;

public class LargestPrimeFactor {
    public static void main (String[] args) {
        long num = 600851475143L;

        long[] primeFactors = new long[0];
        long factor;
        for (factor = 2; factor <= num; factor++) {
            if (num % factor == 0) {
                num = num / factor;
                primeFactors = Arrays.copyOf(primeFactors, primeFactors.length + 1);
                primeFactors[primeFactors.length - 1] = factor;
            }
        }
        if (num > primeFactors[primeFactors.length - 1]) {
            primeFactors = Arrays.copyOf(primeFactors, primeFactors.length + 1);
            primeFactors[primeFactors.length - 1] = factor;
        }
        System.out.println(Arrays.toString(primeFactors));

    }
}
