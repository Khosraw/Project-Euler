package me.khosraw;

public class SpecialPythagoreanTriplet {
    public static void main (String[] args) {
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                for (int k = 1; k < 1000; k++) {
                    double finalPow = Math.pow(i, 2) + Math.pow(j, 2);
                    if (finalPow == Math.pow(k, 2)) {
                        if (i + j + k == 1000) {
                            System.out.println(i*j*k);
                            return;
                        }
                    }
                }
            }
        }
    }
}
