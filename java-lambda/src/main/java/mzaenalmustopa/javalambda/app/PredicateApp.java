package mzaenalmustopa.javalambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        Predicate<String> predicateCheckIsBlank = value -> value.isBlank();

        System.out.println(predicateCheckIsBlank.test(""));
        System.out.println(predicateCheckIsBlank.test("Hello World"));
    }
}
