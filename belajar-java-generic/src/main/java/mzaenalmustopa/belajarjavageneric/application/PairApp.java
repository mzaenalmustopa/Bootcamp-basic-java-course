package mzaenalmustopa.belajarjavageneric.application;

import mzaenalmustopa.belajarjavageneric.util.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("topa", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
