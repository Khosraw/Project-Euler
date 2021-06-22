package me.khosraw;

public class SmallestMultiple {
    public static void main (String[] args) {
        int counter = 20;
        while (counter <= 20000000) {
            if (counter % 2 == 0 && counter % 3 == 0 && counter % 4 == 0 && counter % 5 == 0 && counter % 6 == 0 && counter % 7 == 0 && counter % 8 == 0 && counter % 9 == 0 && counter % 10 == 0 && counter % 11 == 0 && counter % 12 == 0 && counter % 13 == 0 && counter % 14 == 0 && counter % 15 == 0 && counter % 16 == 0 && counter % 17 == 0 && counter % 18 == 0 && counter % 19 == 0 && counter % 20 == 0) {
                counter = 200000000;
                System.out.println(counter + " is the answer!");
            } else {
                counter = counter + 1;
            }
        }

    }
}
