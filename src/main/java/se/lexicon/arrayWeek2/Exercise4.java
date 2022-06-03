package se.lexicon.arrayWeek2;

import java.util.Arrays;

/**
4. Write a program which will copy the elements of one array into another
array.
Expected output: Elements from first array: 1 15 20
Elements from second array: 1 15 20
 */
public class Exercise4 {
    public static void main(String[] args) {

        int [] numbers = new int[] {1,15,20};
        int [] numbers2 = Arrays.copyOf(numbers,3);

                for (int number : numbers2) {
                    System.out.print(number+ " ");
                }

    }

}
