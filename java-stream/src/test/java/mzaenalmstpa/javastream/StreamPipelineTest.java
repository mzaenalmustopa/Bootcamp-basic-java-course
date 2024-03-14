package mzaenalmstpa.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline() {
        // JARANG SEKALI CARA INI DI GUNAKAN OLEH DEVELOPER JAVA
        List<String> list = List.of("Muhamad", "Zaenal", "Mustoopa");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOK() {
        // INI ADALAH CARA YANG DI GUNAKAN OLEH DEVELOPER JAVA KARENA SANGAT EFISIEN
        List<String> list = List.of("Muhamad", "Zaenal", "Mustopa");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }
}
