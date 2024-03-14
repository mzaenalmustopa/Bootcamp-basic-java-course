package mzaenalmustopa.javacollections;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level {
        FREE, STANDAR, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Topa");
        map.put(Level.VIP, "Zaenal");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
