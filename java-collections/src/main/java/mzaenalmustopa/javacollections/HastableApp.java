package mzaenalmustopa.javacollections;

import java.util.Hashtable;
import java.util.Map;

public class HastableApp {
    public static void main(String[] args) {

        Map<String, String > map = new Hashtable<>();

        map.put("Topa", "Topa");
        map.put("Zaenal", "Zaenal");
        map.put("Muhamad", "Muhamad");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
