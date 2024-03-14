package mzaenalmustopa.javacollections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("muhamad", "muhamad");
        map.put("zaenal", "zaenal");
        map.put("mustopa", "mustopa");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Topa"));
        System.out.println(map.higherKey("Topa"));

        NavigableMap<String, String> map2 = new TreeMap<>(map);
        for (var key : map2.keySet()) {
            System.out.println(key);
        }
    }
}
