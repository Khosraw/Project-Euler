package me.khosraw;

import java.util.Arrays;

public class LargestPalindromeProduct {
    public static boolean isPalindrome (int num) {
        String stringNum = toString(num);
        String[] numDigits = new String[0];

        for (int i = 0; i <= stringNum.length(); i++) {
            numDigits = Arrays.copyOf(numDigits, numDigits.length + 1);
            numDigits[numDigits.length - 1] = stringNum;
        }

        String[] newnumDigits = new String[0];
        for (int i = 0; i <= numDigits.length; i++) {
            newnumDigits = Arrays.copyOf(newnumDigits, newnumDigits.length + 1);
            newnumDigits[i] = numDigits[numDigits.length - 1 - i];
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < stringArray.length; i++) {
            sb.append(stringArray[i]);
        }
        String str = sb.toString();
        System.out.println(str);

        if ()

    }

    public static String toString (int num) {
        String stringNum = Integer.toString(num);

        return stringNum;
    }

    public static void main (String[] args) {
        int num;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; i <= 999; j++) {
                num = i * j;
                isPalindrome(num);
            }
        }

    }
}
