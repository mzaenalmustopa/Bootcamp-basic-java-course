package mzaenalmstpa.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperations {

    @Test
    void testPeak() {
        List.of("Muhamad","Zaenal","Mustopa").stream()
                .map(name -> {
                    System.out.println("Before Change Name to Upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change Name to Upper " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final Name : " + name));
    }

    @Test
    void testPeakAfter() {
        List.of("Muhamad","Zaenal","Mustopa").stream()
                .peek(name -> System.out.println("Before Change Name to Upper : " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change Name to Upper : " + upper))
                .forEach(name -> System.out.println("Final Name : " + name));
    }
}
