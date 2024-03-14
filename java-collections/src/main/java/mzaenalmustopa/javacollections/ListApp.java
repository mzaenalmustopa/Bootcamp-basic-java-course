package mzaenalmustopa.javacollections;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        //List<String> strings1 = new LinkedList<>();

        strings.add("muhamad");
        strings.add("zaenal");

        strings.set(0,"topa");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings){
            System.out.println(value);
        }
    }
}
