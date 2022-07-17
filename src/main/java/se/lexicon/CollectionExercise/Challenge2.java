package se.lexicon.CollectionExercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 2. Create a new hashMap of types <String,String> and populate it with elements containing an
 * email (String) and a name (String). Next, create a new Set and populate it with the keys from
 * the hashMap you created
 */

public class Challenge2 {
    public static void main(String[] args) {
        HashMap<String, String > names= new HashMap<>();

        names.put("ly@mail.com", "Ly");
        names.put("lan@mail.com", "Lan");
        names.put("mai@mail.com", "Mai");

        Set<String> keyMap = new HashSet<>();
        keyMap.addAll(names.keySet());
        System.out.println(keyMap);
    }
}
