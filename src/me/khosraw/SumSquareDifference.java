package me.khosraw;

public class SumSquareDifference {
    public static void main (String[] args) {
        double sumSquare = 0;
        long squareSum = 0;

        for (long i = 1; i <= 100; i++) {
            sumSquare = sumSquare + Math.pow(i, 2);
        }

        for (long i = 1; i <= 100; i++) {
            squareSum = squareSum + i;
        }
        double val = Math.pow(squareSum, 2) - sumSquare
        System.out.println(Math.pow(squareSum, 2) - sumSquare);

    }
}
