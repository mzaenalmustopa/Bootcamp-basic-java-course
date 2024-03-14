package mzaenalmstpa.javastream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        List.of("Muhamad","Zaenal","Mustopa","Eko","kurniawan","Khannedy").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Muhamad","Zaenal","Mustopa","Eko","kurniawan","Khannedy").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
