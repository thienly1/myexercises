package se.lexicon.arrayWeek2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 11.Write a program that ask the user for an integer and repeat that
 * question until user give you a specific value that user already has been
 * told about as a message in your program. Store these values in an array
 * and print that array. After that reverse the array elements so that the
 * first element becomes the last element, the second element becomes
 * the second to last element, etc. Do not just reverse the order in which
 * they are printed. You need to change the way they are stored in the
 * array.
 */
public class Exercise11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int index = 1;
        String input = null;
        boolean invalid = true;
        String [] arrays=new String[index];

        while (invalid) {

            for ( int i = 0; i< index; i++) {
                System.out.println("Enter an integer: ");
               input = sc.nextLine();
                arrays[i] = input;
                try {
                    Integer.parseInt(arrays[i]);
                    System.out.println(arrays[i] + " is a valid integer");
                    invalid = false;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(arrays[i] + " is not a valid integer");
                }
                index++;
                arrays = Arrays.copyOf(arrays, index);
            }
            System.out.println(Arrays.deepToString(arrays));
        }
        String [] newArr = new String[arrays.length];
        for ( int i = 0; i < arrays.length; i++) {
                newArr[i] = arrays[arrays.length-i-1];
        }
        System.out.println(Arrays.deepToString(newArr));
    }

    }

