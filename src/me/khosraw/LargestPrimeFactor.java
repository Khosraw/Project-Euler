package me.khosraw;

import java.util.Arrays;

public class LargestPrimeFactor {
    public static void main (String[] args) {
        long[] factors = new long[0];

        for (long i = Long.parseLong("1000000000000"); i <= Long.parseLong("300851475143"); i++) {
            if (Long.parseLong("600851475143") % i == 0) {
                factors = Arrays.copyOf(factors, factors.length + 1);
                factors[factors.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(factors));
        long result = 0;
        for (int i = 0; i < 467; i++) {
            result = result + factors[i];
        }

        System.out.println(result);

    }
}
