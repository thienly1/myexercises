package se.lexicon.CollectionExercise;

import java.util.*;

/**
 * 5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and
 * pay attention to the order of the elements
 */

public class Ex5 {
    public static void main(String[] args) {
        Set<Enum> wholeWeek = new TreeSet<>();
        wholeWeek.addAll(Arrays.asList(DAYS_IN_WEEK.values()));

        
    }
}
