package me.khosraw;

public class SumSquareDifference {
    public static void main (String[] args) {
        double sumSquare = 0;
        long squareSum;

        for (long i = 1; i <= 100; i++) {
            sumSquare = sumSquare + Math.pow(i, 2);
        }

        for (long i = 1; i <= 100; i++) {
            squareSum = squareSum + Math.pow(i, 2);
        }

    }
}
