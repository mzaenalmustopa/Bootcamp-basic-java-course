package mzaenalmustopa.javalambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Muhamad","Zaenal","Mustopa"));

        // for loop
        for (var name : names){
            if (name.length() > 5){
                names.remove(name);
            }
        }

        // remove if anonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });

        // lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
