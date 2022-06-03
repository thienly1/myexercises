package se.lexicon.arrayWeek2;

import java.util.Arrays;

/**
 * 9. Write a method which will add elements in an array.
 * Remember that arrays are fixed in size so you need to come up with a
 * solution to “expand” the array.
 */

public class Exercise9 {
    public static void main(String[] args) {
        String[] city = {"Växjö", " Alvest", "Ljungby"};
        String [] citys = { "Rottne", "Lund", "Malmo", "Goteborg"};
                addElementsToArray(city,citys);
        System.out.println(Arrays.toString(addElementsToArray(city,citys)));
        }
        public static String[] addElementsToArray(String [] name, String[] names){
        String[] newArray = Arrays.copyOf(name,name.length+ names.length);
                for ( int i = 0; i< names.length; i++) {
                    newArray[name.length+i] = names[i];
                };
                return newArray;
        }

    }


