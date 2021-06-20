package me.khosraw;

import java.util.Arrays;

public class LargestPrimeFactor {
    public static void main (String[] args) {
        long[] factors = new long[0];

        for (long i = Long.parseLong("1"); i <= Long.parseLong("13195"); i++) {
            if (Long.parseLong("13195") % i == 0 && Long.parseLong("13195") % 2 != 0 && Long.parseLong("13195") % 3 != 0) {
                int j = 5;
                while (Math.pow(j, 2) <= Long.parseLong("13195")) {
                    if (Long.parseLong("13195") % j == 0 || Long.parseLong("13195") % (j + 2) == 0) {
                        j = 10000;
                    } else {
                        j += 6;
                        factors = Arrays.copyOf(factors, factors.length + 1);
                        factors[factors.length - 1] = i;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(factors));

    }
}
