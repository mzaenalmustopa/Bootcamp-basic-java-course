package mzaenalmustopa.belajarjavageneric.application;

import mzaenalmustopa.belajarjavageneric.util.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Topa","Indonesia"),
                new Person("Topa","Indonesia"),
                new Person("Topa","Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
