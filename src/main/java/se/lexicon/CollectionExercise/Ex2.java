package se.lexicon.CollectionExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Create a new list and populate it with the days of the week. Lastly, iterate through the list
 * and print out each element separately
 */

public class Ex2 {
    public static void main(String[] args) {
        List<String> aWeek = new ArrayList<>();
        aWeek.add("MONDAY");
        aWeek.add("TUESDAY");
        aWeek.add("WEDNESDAY");
        aWeek.add("THURSDAY");
        aWeek.add("FRIDAY");
        aWeek.add("SATURDAY");
        aWeek.add("SUNDAY");
        for( String i: aWeek){
            System.out.println(i);
        }

    }
}
