package mzaenalmustopa.javacollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Topa", "Topa Value");
        map.put("Zaenal", "Zaenal Value");
        map.put("Muhamad", "Muhamad Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
