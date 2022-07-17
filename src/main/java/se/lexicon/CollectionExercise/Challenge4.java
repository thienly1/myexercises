package se.lexicon.CollectionExercise;

import java.util.*;

/**
 * 4. Create an array of type int with numbers: {1,4,4,2,6,7}. Next, create an appropriate Collection
 * and populate it with the content of the int array. Lastly, print out each element in the
 * Collection without duplicates
 */

public class Challenge4 {
    public static void main(String[] args) {

        int[] numbers = {1, 4, 4, 2, 6, 7};
        Collection<Integer> number = new ArrayList<>();
        for ( int a: numbers){
            number.add(a);
        }
        Set<Integer> numberSet = new HashSet<>(number);
        System.out.println("numberSet = " + numberSet);

    }
}
