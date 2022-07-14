package se.lexicon.CollectionExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * 7. Create a new hashSet and populate it with random names. Then convert the hashSet to an
 * arrayList. Lastly, manually sort the list in alphabetical order and print it out.
 */

public class Ex7 {
        public static void main(String[] args) {

            HashSet<String> names = new HashSet<>();
            names.add("Åsa");
            names.add("Ly");
            names.add("Anusa");
            names.add("Jonas");
            names.add("Rodabeh");

            List<String> convertNames = new ArrayList<>();
            convertNames.addAll(names);
            Collections.sort(convertNames);
            System.out.println(convertNames);
    }
}
