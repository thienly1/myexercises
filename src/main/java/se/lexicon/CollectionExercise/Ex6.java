package se.lexicon.CollectionExercise;

import java.util.*;

/**
 * 6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to
 * an arrayList
 */

public class Ex6 {
    public static void main(String[] args) {

        HashSet<Enum> wholeWeek = new HashSet<>();
        wholeWeek.addAll(Arrays.asList(DAYS_IN_WEEK.values()));
        List<Enum> a = new ArrayList<>();
        a.addAll(wholeWeek);
        Collections.sort(a);
        System.out.println("a = " + a);
    }
}
