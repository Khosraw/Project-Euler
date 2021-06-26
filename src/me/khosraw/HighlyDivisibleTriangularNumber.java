package me.khosraw;

public class HighlyDivisibleTriangularNumber {

    public static void main (String[] args) {
        int sum = 0;
        int divisions = 0;

        for (int i = 1; i < 100000; i++) {
            sum += i;

            for (int j = 1; j <= sum; j++) {
                if (sum % j == 0) {
                    divisions += 1;
                    if (divisions - 1 >= 500) {
                        System.out.println(sum + " is the first triangle number to have over five hundred divisors.");
                        return;
                    }
                }
            }
            divisions = 0;
        }
    }
}
