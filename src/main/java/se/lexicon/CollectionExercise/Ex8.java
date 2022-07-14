package se.lexicon.CollectionExercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 8. Create a new hashSet and populate it with random names. Lasty, sort the names in
 * alphabetical order using only a Set or a child of Set.
 */

public class Ex8 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Åsa");
        names.add("Ly");
        names.add("Anusa");
        names.add("Jonas");
        names.add("Rodabeh");
        Set<String> sortNames= new TreeSet<>(names);
        Iterator<String> itr = sortNames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }



}
