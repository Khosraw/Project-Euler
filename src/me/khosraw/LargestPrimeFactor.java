package me.khosraw;

import java.util.Arrays;

public class LargestPrimeFactor {
    public static void main (String[] args) {
        int[] factors = new int[0];

        for (int i = 1; i <= Long.parseLong("300851475143"); i++) {
            if (Long.parseLong("600851475143") % i == 0) {
                factors = Arrays.copyOf(factors, factors.length + 1);
                factors[factors.length - 1] = i;
            }
        }
        System.out.println(Arrays.toString(factors));
        int result = 0;
        for (int i = 0; i < 467; i++) {
            result = result + factors[i];
        }

        System.out.println(result);

    }
}
