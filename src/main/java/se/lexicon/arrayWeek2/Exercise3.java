package se.lexicon.arrayWeek2;

import java.util.Arrays;

/**
3. Write a program which will sort string array.
Expected output: String array: [Paris, London, New York, Stockholm]
 Sort string array: [London, New York, Paris, Stockholm]
 */
public class Exercise3 {
    public static void main(String[] args) {
        String [] arrays = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));

    }
}
