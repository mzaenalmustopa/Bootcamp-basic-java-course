package mzaenalmstpa.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Muhamad", "Zaenal", "Mustopa").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Muhamad", "Zaenal", "Mustopa", "Eko", "Kurniawan", "Khannedy").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("eko", "Muhamad", "Zaenal", "Mustopa", "Budi", "Joko").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Muhamad", "Zaenal", "Mustopa", "Budi", "joko", "Eko").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testAny() {
        Optional<String> optional = List.of("Muhamad", "Zaenal", "Mustopa", "Budi", "joko", "Eko").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Muhamad", "Zaenal", "Mustopa", "Budi", "joko", "Eko").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
