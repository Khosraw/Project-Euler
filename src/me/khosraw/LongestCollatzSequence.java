package me.khosraw;

public class LongestCollatzSequence {
    public static void main (String[] args) {
        int num = 3;
        long temp = num;
        int  terms = 1;
        int longestTerm = 0;

        while (num < 1000000) {
            if (terms == 1) {
                temp = num;
            }
             if (temp % 2 == 0) {
                temp = temp/2;
                terms = terms + 1;
            } else if (temp % 2 == 1) {
                temp = 3 * temp + 1;
                terms = terms + 1;
            }
            if (temp == 1) {
                if (terms > longestTerm) {
                    longestTerm = terms;
                } else {
                    num = num + 1;
                }
                terms = 1;
            }
        }
        System.out.println(longestTerm);
    }
}
