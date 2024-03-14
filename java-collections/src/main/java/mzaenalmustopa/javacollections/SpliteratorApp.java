package mzaenalmustopa.javacollections;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {

        List<String> list = List.of("Muhamad","Zaenal","Muatopa");

        Spliterator<String> spliterator = list.spliterator();
        Spliterator<String> spliterator2 = list.spliterator();

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator2.estimateSize());

        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
