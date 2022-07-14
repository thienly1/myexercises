package se.lexicon.CollectionExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
 */

public class Ex1 {
    public static void main(String[] args) {
        List<String> aWeek = new ArrayList<>();
        aWeek.add("MONDAY");
        aWeek.add("TUESDAY");
        aWeek.add("WEDNESDAY");
        aWeek.add("THURSDAY");
        aWeek.add("FRIDAY");
        aWeek.add("SATURDAY");
        aWeek.add("SUNDAY");
        System.out.println("aWeek = " + aWeek);

    }

}
