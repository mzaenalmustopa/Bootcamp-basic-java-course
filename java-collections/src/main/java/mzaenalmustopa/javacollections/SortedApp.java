package mzaenalmustopa.javacollections;

import mzaenalmustopa.javacollections.data.Person;
import mzaenalmustopa.javacollections.data.PersonComparator;


import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Topa"));
        people.add(new Person("Zaenal"));
        people.add(new Person("Mustopa"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Topa")); // error
    }
}
