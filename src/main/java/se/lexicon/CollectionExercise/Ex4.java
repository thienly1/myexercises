package se.lexicon.CollectionExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Create a new list and populate it with the days of the week. Then create a new list out of the
 * first three elements of the first list using a subList.
 */

public class Ex4 {
    public static void main(String[] args) {

        List<String> aWeek = new ArrayList<>();
        aWeek.add("MONDAY");
        aWeek.add("TUESDAY");
        aWeek.add("WEDNESDAY");
        aWeek.add("THURSDAY");
        aWeek.add("FRIDAY");
        aWeek.add("SATURDAY");
        aWeek.add("SUNDAY");

        List<String> aWeek2 = new ArrayList<>();
        aWeek2.addAll(aWeek.subList(3, 7));
        System.out.println("aWeek2 = " + aWeek2);

    }

}
