package me.khosraw;

public class SummationOfPrimes {
    public static boolean isPrime (int n) {
        boolean prime = true;
        if (n < 2) return false;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main (String[] args) {
        long sum = 2;
        for(int i = 3; i < 2000000; i += 2) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
