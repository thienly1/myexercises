package se.lexicon.CollectionExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Create a new list and populate it with the days of the week excluding THURSDAY. Lastly,
 * insert the weekday THURSDAY into the right position in the list.
 */

public class Ex3 {
    public static void main(String[] args) {
        List<String> aWeek = new ArrayList<>();
        aWeek.add("MONDAY");
        aWeek.add("TUESDAY");
        aWeek.add("WEDNESDAY");
        aWeek.add("FRIDAY");
        aWeek.add("SATURDAY");
        aWeek.add("SUNDAY");

        aWeek.add(3,"THURSDAY");
        System.out.println(aWeek);
    }
}
