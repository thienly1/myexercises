package se.lexicon.CollectionExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 3. Create a new class and call it SuperHero. Add fields for Id,Name and Age + getters and
 * setters. Have the class implement the Comparable interface. Implement the override method
 * and have it compare the AGE of the superhero. Next, create a new arrayList of type
 * SuperHero. Sort the list by age and print out each element.
 */

public class Challenge3 {
    public static void main(String[] args) {
        SuperHero superHero1 = new SuperHero(1, "Ly", 25);
        SuperHero superHero2 = new SuperHero(2, "Lan", 29);
        SuperHero superHero3 = new SuperHero(3, "Loan", 26);
        SuperHero superHero4 = new SuperHero(4,"Mai", 46);

        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(superHero1);
        superHeroes.add(superHero2);
        superHeroes.add(superHero3);
        superHeroes.add(superHero4);

        Collections.sort(superHeroes);
        for(SuperHero a: superHeroes){
            System.out.println("Id: " + a.getId() + " Name: " + a.getName() + " Age: " + a.getAge());
        }

    }
}
