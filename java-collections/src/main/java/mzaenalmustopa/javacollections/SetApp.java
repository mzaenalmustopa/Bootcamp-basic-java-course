package mzaenalmustopa.javacollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        // linked hashet memastikan data yang kita input sangat urutan
        Set<String> set = new LinkedHashSet<>();

        // sedangkan set data kita tidak berurut
        Set<String> names = new HashSet<>();
        names.add("muhamad");
        names.add("zaenal");
        names.add("mustopa");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
