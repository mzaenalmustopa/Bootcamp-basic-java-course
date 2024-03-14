package mzaenalmustopa.javacollections;

import java.util.*;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Topa");

        Set<String> mutable = new HashSet<>();
        mutable.add("Topa");
        mutable.add("Zaenal");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        // yang di eksekusi akan hanya satu nama karena tidak boleh duplikat
        Set<String> set = Set.of("Topa", "Topa", "Zaenal");
    }
}
