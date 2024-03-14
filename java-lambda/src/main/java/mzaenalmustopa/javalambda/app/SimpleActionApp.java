package mzaenalmustopa.javalambda.app;

import mzaenalmustopa.javalambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        // versi manual
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Topa";
//            }
//        };
//
//        System.out.println(simpleAction1.action());
//
//        // versi simple lambda
//        SimpleAction simpleAction2 = () -> {
//            return "Topa";
//        };
//
//        System.out.println(simpleAction2.action());

        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };


        // lambda tanpa blok
        SimpleAction simpleAction3 = (String value) -> "Hello " + value;

        SimpleAction simpleAction4 = (value) -> "Hello " + value;
        // lambda tanpa blok dan kurung buka
        SimpleAction simpleAction5 = value -> "Hello " + value;


    }
}
