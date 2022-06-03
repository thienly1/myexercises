package se.lexicon.arrayWeek2;

import java.util.Arrays;

/**
1. Write a program which will store elements in an array of type ‘int’ and
print it out.
Expected output: 11 23 39 etc.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 8};

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
