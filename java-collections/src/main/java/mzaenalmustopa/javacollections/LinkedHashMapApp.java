package mzaenalmustopa.javacollections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "topa");
        map.put("second", "zaenal");
        map.put("third", "muhamad");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
