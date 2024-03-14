package mzaenalmustopa.javacollections;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("muhamad", "zaenal", "mustopa");

        for (var name : names){
            System.out.println(name);
        }
    }
}
