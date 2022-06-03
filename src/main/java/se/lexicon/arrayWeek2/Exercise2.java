package se.lexicon.arrayWeek2;

import java.util.Scanner;
/**
2. Create a program and create a method with name ‘indexOf’ which will
find and return the index of an element in the array. If the element
doesn’t exist your method should return -1 as value.
Expected output: Index position of number 5 is: 2.
 */
public class Exercise2 {
    public static void main(String[] args) {

        int [] numbers = {1,4,5,2,30};
        int findElement = 30;
        int index = indexOf(findElement, numbers);
                        System.out.println("Index position of number " + findElement + " is " + index);
    }
    public static int indexOf(int find, int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            if (find == arrays[i]) {
                return i;
            }
        }
        return -1;


    }


}



