package mzaenalmustopa.javacollections;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Eko");
        list.add("Zaenal");
        list.add("Muhamad");

        for (var value : list) {
            System.out.println(value);
        }
    }
}
