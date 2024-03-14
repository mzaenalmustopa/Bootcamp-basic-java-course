package mzaenalmstpa.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void testFilter() {
        List.of("Muhamad", "Zaenal", "Mustopa", "Budi", "Nugraha").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Muhamad", "Zaenal", "Muhamad", "Zaenal", "Mustopa", "Budi", "Nugraha").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
