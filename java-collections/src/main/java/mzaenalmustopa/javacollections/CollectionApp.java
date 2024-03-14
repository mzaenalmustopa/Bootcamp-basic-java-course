package mzaenalmustopa.javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("topa");
        collection.add("zaenal");
        collection.add("mustopa");
        collection.addAll(List.of("muhamad", "zaenal", "mustopa"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("topa");
        collection.removeAll(List.of("zaenal", "mustopa"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("topa")
        );

        System.out.println(
                collection.containsAll(List.of("zaenal", "mustopa"))
        );

        System.out.println(collection.size());
    }
}
