package mzaenalmstpa.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {

        // ini tidak bisa di eksekusi karena intermediate
        List<String> names = List.of("Muhamad", "Zaenal", "Mustopa");

        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change" + name + "to UPPERCASE");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("Muhamad", "Zaenal", "Mustopa");

        names.stream()
                .map(name -> {
                    System.out.println("Change" + name + "to UPPERCASE");
                    return name.toUpperCase();
                })
                .forEach(upper -> {
                    System.out.println(upper);
                });
    }
}
