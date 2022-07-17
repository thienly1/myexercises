package se.lexicon.CollectionExercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1. Create an empty set and populate it with the all the days of the week.
 *    Next create a second set and populate it with ONLY the weekend days (SATURDAY and SUNDAY).
 *    Lastly, compare the two sets and retain in the first set only those days that exist in both sets.
 */

public class challenge1 {
    public static void main(String[] args) {
        Set<Enum> daysInWeek = new HashSet<>();
        daysInWeek.addAll(Arrays.asList(DAYS_IN_WEEK.values()));
        System.out.println(daysInWeek);

        Set<Enum> weekendDays = new HashSet<>();
        weekendDays.add(DAYS_IN_WEEK.SATURDAY);
        weekendDays.add(DAYS_IN_WEEK.SUNDAY);

        daysInWeek.retainAll(weekendDays);
        System.out.println(daysInWeek);

    }
}
