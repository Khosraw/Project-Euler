package me.khosraw;

import java.util.Arrays;

public class LargestPrimeFactor {
    public static void isPrime (int n) {
        if (n)
    }

    public static void main (String[] args) {
        long[] factors = new long[0];

        for (long i = Long.parseLong("1"); i <= 600851475143L; i++) {
            if (600851475143L % i == 0 && Long.parseLong("600851475143") % 2 != 0 && Long.parseLong("600851475143") % 3 != 0) {
                factors = Arrays.copyOf(factors, factors.length + 1);
                factors[factors.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(factors));

    }
}
