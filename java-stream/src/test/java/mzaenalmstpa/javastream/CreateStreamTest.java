package mzaenalmstpa.javastream;

import com.sun.source.doctree.SeeTree;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("Topa");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = "Zaenal";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(value -> {
            System.out.println(value);
        });
    }

    @Test
    void testCreateFromArray() {
        Stream<String> arrayStream = Stream.of("Muhamad", "Zaenal", "Mustopa");
        arrayStream.forEach(name -> System.out.println(name));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.forEach(System.out::println);

        String[] array = new String[]{
                "Muhamad", "Zaenal", "Mustopa"
        };

        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Muhamad", "Zaenal", "Mustopa");
        Stream<String> stringStream = collection.stream();
        // string hanya bisa di gunakan satu kali, jika duplikat dia akan error
        stringStream.forEach(System.out::println);
    }

    @Test
    void testInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Muhamad Zaenal Mustopa");
        // ini akan di print out tanpa henti
//        stream.forEach(System.out::println);
    }
}
