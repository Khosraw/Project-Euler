package me.khosraw;

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
            if (isPrime(i)) {

            }
        }

    }
}
