package mzaenalmustopa.javacollections;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("muhamad", "zaenal", "mustopa"));

        NavigableSet<String> nameReverse = names.descendingSet();
        NavigableSet<String> zaenal = nameReverse.tailSet("zaenal", true);

        for (var name : zaenal) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("topa"); // error
    }
}
