package me.khosraw;

import java.util.Arrays;

public class LargestPalindromeProduct {
    public static String toString (int num) {
        return Integer.toString(num);
    }

    public static boolean isPalindrome (int num) {
        String stringNum = toString(num);

        // Creating array of string length
        char[] ch = new char[stringNum.length()];

        // Copy character by character into array
        for (int i = 0; i < stringNum.length(); i++) {
            ch[i] = stringNum.charAt(i);
        }

        // Convert ch array to String in numDigits
        String[] numDigits = new String[0];
        for (int i = 0; i < stringNum.length(); i++) {
            numDigits = Arrays.copyOf(numDigits, numDigits.length + 1);
            numDigits[numDigits.length - 1] = String.valueOf(ch[i]);
        }

        // Reversing string
        String[] newnumDigits = new String[0];
        for (int i = 0; i < numDigits.length; i++) {
            newnumDigits = Arrays.copyOf(newnumDigits, newnumDigits.length + 1);
            newnumDigits[i] = numDigits[numDigits.length - 1 - i];
        }

        // Turn array into string
        StringBuilder sb = new StringBuilder();
        for (String newnumDigit : newnumDigits) {
            sb.append(newnumDigit);
        }
        String str2 = sb.toString();

        // Compare 2 numbers: Flipped and Non-flipped
        return stringNum.equals(str2);
    }

    public static void main (String[] args) {
        int num;
        int prevNum = 0;
        int largestNum = 0;

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                num = i * j;

                if (isPalindrome(num)) {
                    if (prevNum < num) {
                        largestNum = num;
                        prevNum = num;
                    }
                }
            }
        }
        System.out.println(largestNum);
    }
}
