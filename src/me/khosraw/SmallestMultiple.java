package me.khosraw;

public class SmallestMultiple {
    public static void main (String[] args) {
        int counter = 20;
        while (counter <= 2000000000) {
            if (counter % 7 == 0 && counter % 8 == 0 && counter % 9 == 0 && counter % 11 == 0 && counter % 13 == 0 && counter % 15 == 0 && counter % 16 == 0 && counter % 17 == 0 && counter % 18 == 0 && counter % 19 == 0 && counter % 20 == 0) {
                System.out.println(counter + " is the answer!");
                counter = 2000000001;
            } else {
                counter = counter + 1;
            }
        }

    }
}
