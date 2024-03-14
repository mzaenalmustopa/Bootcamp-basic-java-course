package mzaenalmustopa.javaunittest;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {

    @Test
    void testMock() {

        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Topa");
        Mockito.when(list.get(100)).thenReturn("Zaenal");

        System.out.println(list.get(0));
        System.out.println(list.get(100));

        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}