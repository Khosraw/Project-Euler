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
            newnumDigits[i] = newnumDigits[newnumDigits.length - 1 - i];
        }
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < numDigits.length; i++) {
            sb1.append(numDigits[i]);
        }
        String str1 = sb1.toString();

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < numDigits.length; i++) {
            sb2.append(numDigits[i]);
        }
        String str2 = sb2.toString();

        return str1.equals(str2);

    }

    public static String toString (int num) {
        String stringNum = Integer.toString(num);

        return stringNum;
    }

    public static void main (String[] args) {
        int num;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                num = i * j;

                if (isPalindrome(num)) {
                    System.out.println(num + " is a palindrome!");
                }

            }
        }

    }
}
