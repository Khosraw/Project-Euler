/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

package me.khosraw;

import java.util.Arrays;

public class EvenFibonacciNumbers {
    public static void main (String[] args) {
        int[] fibo = new int[0];
        fibo = Arrays.copyOf(fibo, fibo.length + 2);
        fibo[0] = 1;
        fibo[1] = 2;

        int fiboNum = 0;
        int total = 0;
        for (int i = 1; fiboNum < 4000000; i++) {
            fiboNum = fibo[i] + fibo[i - 1];
            fibo = Arrays.copyOf(fibo, fibo.length + 1);
            fibo[fibo.length - 1] = fiboNum;
            System.out.println(fiboNum);
        }

        for (int i = 0; i < fibo.length; i++) {
            if (fibo[i] == 0) {
                total = total + fibo[i];
            }
        }
        
        System.out.println(Arrays.toString(fibo));


    }
}
