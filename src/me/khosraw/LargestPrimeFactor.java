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

        long[] primeFactors = new long[0];

        for (long factor = 2; factor <= num; factor++) {
            if (num % factor == 0) {
                num = num / factor;
                primeFactors = Arrays.copyOf(primeFactors, primeFactors.length + 1);
                primeFactors[primeFactors.length - 1] = factor;
            }
        }
        if (num > primeFactors[primeFactors.length - 1]) {
            
        }
        System.out.println(Arrays.toString(primeFactors));

    }
}
